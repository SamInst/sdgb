package Pizzeria;

public class Cheese {
    private String cheese;
    private String egg;

    public Cheese(String cheese, String egg) {
        this.cheese = cheese;
        this.egg = egg;
    }

    @Override
    public String toString() {
        return "Ingredients: "+cheese+egg;
    }
}
