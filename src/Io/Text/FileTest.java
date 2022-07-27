package Io.Text;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated =  file.createNewFile();
            System.out.println("is Created "+isCreated);
            System.out.println("PAth " + file.getPath());
            System.out.println("Absolute path "+ file.getAbsolutePath());
            boolean exists = file.exists();

            if(exists){
                boolean delete = file.delete();
                System.out.println("Deleted " + delete);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
