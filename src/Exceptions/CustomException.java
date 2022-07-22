package Exceptions;

public class CustomException extends  Exception{
    public CustomException() {
        super("Invalid Login");
    }

    public CustomException(String message) {
        super(message);
    }
}
