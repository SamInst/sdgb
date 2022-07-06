package Exceptions;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {

    }

    public static void readFile2() {
        try {
            Reader reader = new BufferedReader(new FileReader("test.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        public static void readFile () {
            Reader reader = null;
            try {
                reader = new BufferedReader(new FileReader("test.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

