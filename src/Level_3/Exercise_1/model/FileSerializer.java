package Level_3.Exercise_1.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class FileSerializer {

    private String directory;

    public FileSerializer(String directory){
        this.directory = directory;
    }

    public void setDirectory(String directory){
        this.directory = directory;
    }

    public void serialize(Object object) throws IllegalAccessException, IOException {
        Class<?> objectClass = object.getClass();
        JsonSerializable annotation = objectClass.getAnnotation(JsonSerializable.class);

        if (annotation == null) {
            throw new RuntimeException("Class " + objectClass.getSimpleName() +
                    " is not annotated with @JsonSerializable");
        }
        StringBuilder jsonString = buildJsonFile(objectClass, object);
        File outputFile = writeOutputFile(objectClass, object, jsonString);
        printOutputDirectoryPath(outputFile);
    }

    public static StringBuilder buildJsonFile (Class<?> objectClass, Object object) throws IllegalAccessException {
        StringBuilder jsonString = new StringBuilder("{\n");
        List<Field> fields = getAllFields(objectClass);

        for (int i = 0; i < fields.size(); i++) {
            Field field = fields.get(i);
            field.setAccessible(true);
            Object value = field.get(object);

            jsonString.append("  \"").append(field.getName()).append("\": ");

            if (value instanceof String) {
                jsonString.append("\"").append(value).append("\"");
            } else {
                jsonString.append(value);
            }

            if (i < fields.size() - 1) jsonString.append(",");
            jsonString.append("\n");
        }
        jsonString.append("}");
        return jsonString;
    }

    public File writeOutputFile(Class<?> objectClass, Object object, StringBuilder jsonString){
        File outputFile = new File(this.directory, objectClass.getSimpleName() + ".json");
        try (FileWriter writer = new FileWriter(outputFile)) {
            writer.write(jsonString.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
        return outputFile;
    }
    public void printOutputDirectoryPath(File outputFile){
        System.out.println("JSON file created at: " + outputFile.getPath());
    }

    private static List<Field> getAllFields(Class<?> clazz) {
        List<Field> fields = new ArrayList<>();
        Class<?> current = clazz;

        while (current != null && current != Object.class) {
            Field[] declaredFields = current.getDeclaredFields();
            for (Field field : declaredFields) {
                fields.add(field);
            }
            current = current.getSuperclass();
        }
        return fields;
    }
}