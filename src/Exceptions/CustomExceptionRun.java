package Exceptions;

import java.util.Scanner;

public class CustomExceptionRun {
    public static void main(String[] args) {

    }
    private static void  login() throws CustomException {
        Scanner keyboard = new Scanner(System.in);
        String usernamedb = "sam";
        String password = "1234";
        System.out.println("User: ");
        String user = keyboard.nextLine();
        System.out.println("password: ");
        String pass = keyboard.nextLine();

        if (!usernamedb.equals(user) || !password.equals(pass)){
            throw new CustomException("Invalid User");
        }
        System.out.println("Welcome");
    }
}
