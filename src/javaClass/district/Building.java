package javaClass.district;

import java.util.Base64;

public class Building {
    private int floorsOfBuildings;
    private String buildingsType;
    private int[] numbersOfTwoRoomApartment = new int[floorsOfBuildings * 2];
    private int[] numbersOFThreeRoomApartment;

    Building(String buildingsType, int floorsOfBuildings) {
        setBuildingsType(buildingsType);
        setFloorsOfBuildings(floorsOfBuildings);
    }

    // getter setter for buildings type
   public void setBuildingsType(String type) {
        buildingsType = type;
    }

    public String setBuildingsType() {
        return buildingsType;
    }


    // getter setter for floors of buildings
   public void setFloorsOfBuildings(int count) {
        floorsOfBuildings = count;
    }

    public int getFloorsOfBuildings() {
        return floorsOfBuildings;
    }

    //getters for apartments number
    public int[] getNumbersOfTwoRoomApartment() {
        return numbersOfTwoRoomApartment;
    }

    public int[] getNumbersOFThreeRoomApartment() {
        return numbersOFThreeRoomApartment;
    }


    //   method for saving apartment numbers
    public void theApartmentNumbers(Building building) {
        int numbersOfTwoRoom = 1;
        int numbersOfThreeRoom = 1;
        for (int i = 0; i < (building.floorsOfBuildings * 4) ; i++) {
            if (i / 2 == 0) {
                numbersOfTwoRoomApartment[numbersOfTwoRoom] = i + 2;
                numbersOfTwoRoom++;
            } else {
                numbersOFThreeRoomApartment[numbersOfThreeRoom] = i;
                numbersOfThreeRoom++;
            }
        }
    }
}
