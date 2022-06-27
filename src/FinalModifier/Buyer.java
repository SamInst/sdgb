package FinalModifier;

public class Buyer {
    private String nome;
    public final Buyer buyer = new Buyer();

    @Override
    public String toString() {
        return "Buyer /" +
                "nome= " + nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
