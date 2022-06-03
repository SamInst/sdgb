package Teste;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        int num;
        do {
        System.out.println("Digit a number: \n *digit 0 for exit*");
        Scanner swi = new Scanner(System.in);
        num = swi.nextInt();
            if (num > 12 || num < 0) {
                System.out.println("Nonexistent Number ");
            }
            switch (num) {
                case 1 -> System.out.println("January");
                case 2 -> System.out.println("February");
                case 3 -> System.out.println("Mart");
                case 4 -> System.out.println("April");
                case 5 -> System.out.println("may");
                case 6 -> System.out.println("June");
                case 7 -> System.out.println("July");
                case 8 -> System.out.println("august");
                case 9 -> System.out.println("september ends");
                case 10 -> System.out.println("october *-*");
                case 11 -> System.out.println("november rain");
                case 12 -> System.out.println("december");
            }
        } while (num != 0) ;
    }
}
