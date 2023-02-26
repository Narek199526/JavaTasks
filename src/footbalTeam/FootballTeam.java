package footbalTeam;

public class FootballTeam {
    private String[] playersName = {"Marc-Andre ter Stegen", "Jules Kounde", "Rnald Arajuo", "Andreas Christensen", "Alejandro Balde", "Franck Kessie", "Sergio Busquets", "Frenkie de Jong", "Ousamane Dembele", "Robert Lewandowski", "Ferran Torres",};
    private String[] playersNationality = {"Germany", "France", "Uruguay", "Denmark", "Spain", "Italy", "Spain", "Netherlands", "France", "Poland", "Spain"};
    private String[] playersPlayingPosition = {"goalkeeper", "right defender", "right defender", "left defender", "left defender", "right midfielder", "central midfielder", "left midfielder", "right winger", "central winger", "left winger"};
    private int[] playersAge = {30, 24, 23, 26, 19, 26, 34, 25, 25, 34, 22};
    private int[] playersPlayingNumber = {1, 23, 4, 15, 28, 19, 5, 21, 7, 9, 11};
    private int index;
    private String name;

    FootballTeam(String name) {
        this.name = name;
        playersNameIndex();
    }

    private void playersNameIndex() {
        for (int i = 0; i < playersName.length; i++) {
            if (this.name == playersName[i]) {
                index = i;
            }else {
                System.exit(1);
            }
        }
    }

    // Getter for players name
    public String getName() {
        return name;
    }

    // Getter for players nationality
    public String getPlayersNationality() {
        return playersNationality[index];
    }

    // Getter for players age
    public int getPlayersAge() {
        return playersAge[index];
    }

    // Getter for players playing position
    public String getPlayersPlayingPosition() {
        return playersPlayingPosition[index];
    }

    // Getter for players playing number
    public int getPlayersPlayingNumber() {
        return playersPlayingNumber[index];
    }

}