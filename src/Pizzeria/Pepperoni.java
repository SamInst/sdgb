package Pizzeria;

public class Pepperoni {
    private String pepperoni;
    private String egg;
    private String olive;
    private String flour;
    private String ham;

    public Pepperoni(String pepperoni, String egg, String olive, String flour, String ham) {
        this.pepperoni = pepperoni;
        this.egg = egg;
        this.olive = olive;
        this.flour = flour;
        this.ham = ham;
    }

    @Override
    public String toString() {
        return "Ingredients: "+pepperoni + egg + olive + flour + ham;
    }
}
