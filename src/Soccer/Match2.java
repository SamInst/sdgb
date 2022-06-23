package Soccer;

public class Match2 {
    public static void main(String[] args) {
        Players players = new Players("Keke");
        Team team = new Team("Brasil");
        Players[] players1={players};
        players.setTeam(team);
        team.setNome(players.getNome());
        System.out.println(" --- JOgador ---");
        players.imprime();
        System.out.println(" --- Time ---");


    }
}
