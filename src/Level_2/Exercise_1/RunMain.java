package Level_2.Exercise_1;

import Level_2.Exercise_1.model.FileSerializer;
import Level_2.Exercise_1.model.OnSiteWorker;
import java.io.File;
import java.io.IOException;

public class RunMain {

    public static void run(){

        OnSiteWorker worker = new OnSiteWorker("María", "González", 12.5);
        FileSerializer fileSerializer = new FileSerializer("src" + File.separator + "Level_2" + File.separator +
                "Exercise_1" + File.separator + "resources");

        try {
            fileSerializer.serialize(worker);
        } catch (IllegalAccessException iae){
            System.out.println(iae.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}