package javaClass;

public class GasStove {
    private int gasBurners;
    private int electricBurners;
    private boolean isTheGasTurnOn = false;
    private boolean isTheElectricTurnOn = false;

    // constrictor for gas stove
    GasStove(int gas, int electric){
        setGasBurners(gas);
        setElectricBurners(electric);
    }
    // getter setter for electric burners
    void setElectricBurners(int countElectronicBurners) {
        if (countElectronicBurners >= 1 && countElectronicBurners <= 3) {
            electricBurners = countElectronicBurners;
        } else {
            System.out.println("You can't have gaz stove with these electronic burners parameters");
        }
    }
    public int getElectricBurners() {
        return electricBurners;
    }
    // getter setter for gas burners
    void setGasBurners(int countGasBurners) {
        if (countGasBurners >= 3 && countGasBurners <= 5) {
            gasBurners = countGasBurners;
        } else {
            System.out.println("You can't have gaz stove with these gas burners parameters");
        }
    }
    public int getGazBurners() {
        return gasBurners;
    }
    // getter setter for turn on gas burners
    void setIsTheGasTurnOn(boolean turnOn) {
        isTheGasTurnOn = turnOn;
    }
    public boolean getIsTheGasTurnOn() {
        return isTheGasTurnOn;
    }
   // getter setter for turn on electric burners
    void setIsTheElectricTurnOn(boolean turnOn){
        isTheElectricTurnOn = turnOn;
    }
    public boolean getIsTheElectricTurnOn(){
        return isTheElectricTurnOn;
    }
    //method for counting energy
    public int toCountEnergy() {
        int count = 0;
        if (isTheGasTurnOn == true) {
            if (gasBurners == 0 && electricBurners == 0) {
                gasBurners = 5;
            }
            count = gasBurners * 80;
        } else if (isTheElectricTurnOn == true) {
            if (gasBurners == 0 && electricBurners == 0) {
                electricBurners = 3;
            }
                count = electricBurners * 100;
        }
        return count;
    }
}
