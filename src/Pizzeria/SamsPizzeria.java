package Pizzeria;

import java.util.Scanner;

public class SamsPizzeria {
    public static void main(String[] args) {
        int esc;
        Pizzas pizzas = new Pizzas();
        do {
            System.out.println("Welcome to Sam's Pizzeria!" + "\n" +
                    "____________________________" + "\n" +
                    "Choose your Pizza flavor: " + "\n" + "tap 0 to exit " + "\n" +
                    "1- Portuguese " +
                    "2- Pepperoni " +
                    "3- Cheese");
            Scanner sc1 = new Scanner(System.in);
            esc = sc1.nextInt();

            switch (esc) {
                case 1 -> {
                    System.out.println(pizzas.callPizzaPortuguese());
                }
                case 2 -> System.out.println(pizzas.callPizzaPepperoni());
                case 3 -> System.out.println(pizzas.callPizzaCheese());
                default -> {
                    System.out.println("invalid Option");

                }
            }
        } while (esc != 0 || esc > 3);
    }
}
