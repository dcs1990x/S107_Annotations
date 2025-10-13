package Level_3.Exercise_1;

import Level_3.Exercise_1.model.*;
import java.io.File;
import java.io.IOException;

public class RunMain {

    public static void run(){

        Worker worker = new OnSiteWorker("María", "González", 12.5);
        FileSerializer fileSerializer = new FileSerializer("src" + File.separator + "Level_3" + File.separator +
                "Exercise_1" + File.separator + "resources");

        Class<?> objectClass = OnSiteWorker.class;

        try {
            fileSerializer.serialize(worker);
            if (objectClass.isAnnotationPresent(JsonSerializable.class)) {
                JsonSerializable annotation = objectClass.getAnnotation(JsonSerializable.class);
                System.out.println("Directory specified in annotation: " + annotation.directory());
            } else {
                System.out.println("Annotation not found on class " + objectClass.getSimpleName());
            }
        } catch (IllegalAccessException iae){
            System.out.println(iae.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}