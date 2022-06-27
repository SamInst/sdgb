package OverwrittingMethodsToString;

public class Anime01 {
    private String name;

    @Override
    public String toString() {
        return "Anime01 " +
                "name= " + name
                ;
    }

    public String getName() {
        return name;
    }

    public Anime01(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
