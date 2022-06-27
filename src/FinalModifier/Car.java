package FinalModifier;

public class Car {
    private String nome;
    public static final double speed_Limit = 250;
    public final Buyer buyer = new Buyer();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
