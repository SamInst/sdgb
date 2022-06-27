package Pizzeria;
public class Portuguese {
    private String tomato;
    private String onion;
    private String cheese;
    private String egg;
    private String olive;
    private String pepperoni;
    private String flour;
    private String ham;

    @Override
    public String toString() {
        return "Portuguese: " + tomato + ", " + onion + ", " + cheese + ", " + egg + ", " + olive + ", " + pepperoni + ", " + flour + ", " + ham + ", ";
    }

    public Portuguese(String tomato, String onion, String cheese, String egg, String olive, String pepperoni, String flour, String ham) {
        this.tomato = tomato;
        this.onion = onion;
        this.cheese = cheese;
        this.egg = egg;
        this.olive = olive;
        this.pepperoni = pepperoni;
        this.flour = flour;
        this.ham = ham;
    }

    public void Pizzas(String cheese, String egg) {
        this.cheese = cheese;
        this.egg = egg;
    }
}