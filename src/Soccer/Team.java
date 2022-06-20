package Soccer;

public class Team {
    private String nome;
    private Players[] players;

    public Team(String nome) {this.nome = nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getNome() {return nome;}
}
