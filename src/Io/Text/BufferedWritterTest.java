package Io.Text;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWritterTest {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file,true);
             BufferedWriter bf = new BufferedWriter(fw)){
            bf.write("kkkkkkkkkk kkkkkkkkkkkkk kkkkkkkkkkkkkk kkkkkkkkkkkkk");
            bf.newLine();
            bf.write("kkkkkkkkkk kkkkkkkkkkkkk kkkkkkkkkkkkkk kkkkkkkkkkkkk");
            bf.newLine();
            bf.flush();


        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
