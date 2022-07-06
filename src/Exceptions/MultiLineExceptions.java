package Exceptions;

public class MultiLineExceptions {
    public static void main(String[] args) {
        try {
            throw  new RuntimeException();
        }
        catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e ){
            System.out.println("Inside of ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (RuntimeException e){
            System.out.println("Inside of RuntimeException");
        }
    }
}
