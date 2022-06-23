package Soccer;
public class Team {
    private String nome;
    private Players[] players;
    public Team(String nome) {this.nome = nome;
    }

    public void imprime() {
        System.out.println(nome);

    }
    public void imprime2(){
        System.out.println(this.players);
        if (players == null){return;}
        for (Players players : players){
            System.out.println(players.getNome());
        }
    }
    public void setPlayers(Players[] players) {this.players = players;}
    public Players[] getPlayers() {return players;}
    public void setNome(String nome) {this.nome = nome;}
    public String getNome() {return nome;}
}
