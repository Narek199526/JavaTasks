package footbalTeam;

public class Main {
    public static void main(String[] args) {
        System.out.println("Player one");
        FootballTeam player1 = new FootballTeam("Marc-Andre ter Stegen");
        System.out.println("Name surname - " + player1.getName());
        System.out.println("Nationality - " + player1.getPlayersNationality());
        System.out.println( "Age - " + player1.getPlayersAge());
        System.out.println("Playing position - " + player1.getPlayersPlayingPosition());
        System.out.println("Playing number - " + player1.getPlayersPlayingNumber());

        System.out.println("\nPlayer two");

        FootballTeam player2 = new FootballTeam("Jules Kounde");
        System.out.println("Name surname - " + player2.getName());
        System.out.println("Nationality - " + player2.getPlayersNationality());
        System.out.println( "Age - " + player2.getPlayersAge());
        System.out.println("Playing position - " + player2.getPlayersPlayingPosition());
        System.out.println("Playing number - " + player2.getPlayersPlayingNumber());

        System.out.println("\nPlayer three");

        FootballTeam player3 = new FootballTeam("Alejandro Balde");
        System.out.println("Name surname - " + player3.getName());
        System.out.println("Nationality - " + player3.getPlayersNationality());
        System.out.println( "Age - " + player3.getPlayersAge());
        System.out.println("Playing position - " + player3.getPlayersPlayingPosition());
        System.out.println("Playing number - " + player3.getPlayersPlayingNumber());
    }
}
