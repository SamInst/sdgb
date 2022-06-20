package Soccer;

public class Match {
    public static void main(String[] args) {
        Team team = new Team("brasel");
        Players player1 = new Players("Kaka",team);

//        Players player2 = new Players("Kaka2");
//        Players player3 = new Players("Kaka3");

       // player1.setTeam(team);
//        player2.setTeam(team);
//        player3.setTeam(team);

        player1.imprime();

    }
}
