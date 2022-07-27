package Io.Text;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritterTest {


    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file,true)){
        fw.write("kkkkkkkkkk kkkkkkkkkkkkk kkkkkkkkkkkkkk kkkkkkkkkkkkk \n continue");
        fw.flush();


        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
