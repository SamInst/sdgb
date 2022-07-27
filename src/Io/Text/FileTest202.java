package Io.Text;

import java.io.File;
import java.io.IOException;

public class FileTest202 {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("path");
        boolean mkdir = fileDirectory.mkdir();
        System.out.println(mkdir);

        File fileArqchiveDirectory = new File("/home/samhelson/IdeaProjects/aaaa/path/archive.txt");
        boolean fileiscReated = fileArqchiveDirectory.createNewFile();
        System.out.println(fileiscReated);

        File fileRenamed = new File(fileDirectory,"Archive_renamed.txt");
        boolean isRenamed = fileArqchiveDirectory.renameTo(fileRenamed);
        System.out.println(isRenamed);
        File directoryRenamed = new File("path2");
        boolean isDirectoryRenamed = fileDirectory.renameTo(directoryRenamed);
        System.out.println(isDirectoryRenamed);

    }
}
