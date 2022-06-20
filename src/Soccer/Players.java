package Soccer;

public class Players {
    private String nome;
    private Team team;
    public void imprime() {
        System.out.println(this.nome);
        if (team != null) {
            System.out.println(team.getNome());
        }
    }

    public Players(String nome, Team team) {
        this.nome = nome;
        this.team = team;
    }

    public Players(String nome){this.nome = nome;}
    public Team getTeam() {return team;}
    public void setTeam(Team team) {this.team = team;}
    public String getNome(){return nome;}
    public void setNome(String nome) {this.nome = nome;}

}
