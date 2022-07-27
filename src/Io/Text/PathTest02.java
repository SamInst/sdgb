package Io.Text;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("path2");
        if (Files.notExists(pastaPath)){
            Path directoryPath = Files.createDirectory(pastaPath);

        }
        Path subpastaPath = Paths.get("path2/subPath2/subSubPath2");
        Path subpastDirectory =Files.createDirectory(subpastaPath);
    }
}
