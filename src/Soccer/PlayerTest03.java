package Soccer;

public class PlayerTest03 {
    public static void main(String[] args) {
        Players players = new Players("kiki");
        Players players1 = new Players("koko");
        Team team = new Team("Brasil");
        Players[] players0 = {players, players1};
        players.setTeam(team);
        team.setPlayers(players0);
        System.out.println("--- Player ---");
        players.imprime();
        System.out.println("--- Team ---");
        team.imprime2();
    }
}
