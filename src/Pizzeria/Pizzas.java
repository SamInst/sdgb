package Pizzeria;

public class Pizzas {

Portuguese portuguese = new Portuguese("tomato","Onion","cheese","egg","oliver","pepperoni","flour","ham");
Cheese cheese = new Cheese("cheese", "egg");
Pepperoni pepperoni = new Pepperoni("pepperoni","egg","olive","flour","ham");
    public boolean callPizzaPortuguese(){
        System.out.println("Ingredients of Pizza Portuguese: ");
        System.out.println(portuguese);
        return false;
    }
    public boolean callPizzaCheese() {
        System.out.println("Ingredients of Pizza Cheese: ");
        System.out.println(cheese);
        return false;
    }
    public boolean callPizzaPepperoni() {
        System.out.println("Ingredients of Pizza Pepperoni: ");
        System.out.println(pepperoni);
        return false;
    }
}
