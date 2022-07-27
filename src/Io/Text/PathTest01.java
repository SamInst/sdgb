package Io.Text;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("/home/samhelson/IdeaProjects/aaaa/path2/Archive_renamed.txt");
        System.out.println(p1.getFileName());
    }
}
