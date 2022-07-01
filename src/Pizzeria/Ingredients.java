package Pizzeria;
public class Ingredients {
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

    public Ingredients(String tomato, String onion, String cheese, String egg, String olive, String pepperoni, String flour, String ham) {
        this.tomato = tomato;
        this.onion = onion;
        this.cheese = cheese;
        this.egg = egg;
        this.olive = olive;
        this.pepperoni = pepperoni;
        this.flour = flour;
        this.ham = ham;
    }

    public Ingredients(String onion, String egg) {
        this.onion = onion;
        this.egg = egg;
    }

    public String getTomato() {
        return tomato;
    }

    public void setTomato(String tomato) {
        this.tomato = tomato;
    }

    public String getOnion() {
        return onion;
    }

    public void setOnion(String onion) {
        this.onion = onion;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getEgg() {
        return egg;
    }

    public void setEgg(String egg) {
        this.egg = egg;
    }

    public String getOlive() {
        return olive;
    }

    public void setOlive(String olive) {
        this.olive = olive;
    }

    public String getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(String pepperoni) {
        this.pepperoni = pepperoni;
    }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    public String getHam() {
        return ham;
    }

    public void setHam(String ham) {
        this.ham = ham;
    }

    public void Pizzas(String cheese, String egg) {
        this.cheese = cheese;
        this.egg = egg;
    }
}