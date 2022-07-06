package Exceptions;

public class Exception02Finally {
    public static void main(String[] args) {

        try {
            System.out.println("Opening file...");
            throw  new RuntimeException();
            //System.out.println("Writing files on data...");
        } catch (Exception e ){
            e.printStackTrace();
        }
        finally {
            System.out.println("Closing SO resources");
        }
    }
}
