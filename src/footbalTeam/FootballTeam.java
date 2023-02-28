package footbalTeam;

public class FootballTeam {
    private String playersName;
    private String playersNationality;
    private String playersPlayingPosition;
    private int playersAge;
    private int playersPlayingNumber;
    FootballTeam(String playersName, String playersNationality, String playersPlayingPosition, int playersAge, int playersPlayingNumber) {
        this.playersName = playersName;
        this.playersNationality = playersNationality;
        this.playersPlayingPosition = playersPlayingPosition;
        this.playersAge = playersAge;
        this.playersPlayingNumber = playersPlayingNumber;
    }gi

   //Getter for player name
    public String getPlayersName (){
        return playersName;
    }

    // Getter for players nationality
    public String getPlayersNationality() {
        return playersNationality;
    }

    // Getter for players age
    public int getPlayersAge() {
        return playersAge;
    }

    // Getter for players playing position
    public String getPlayersPlayingPosition() {
        return playersPlayingPosition;
    }

    // Getter for players playing number
    public int getPlayersPlayingNumber() {
        return playersPlayingNumber;
    }

}