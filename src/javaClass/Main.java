package javaClass;

public class Main {
    public static void main(String[] args) {

        // Main method for gas stove
        GasStove gasStove1 = new GasStove(6, 2);
        gasStove1.setIsTheGasTurnOn(true);

        if (gasStove1.getGazBurners() != 0 && gasStove1.getIsTheGasTurnOn() && gasStove1.getElectricBurners() != 0){
            System.out.println("You turn on '" + gasStove1.getGazBurners() + "' gas burners and energy disconnected from it is " + gasStove1.toCountEnergy());
        } else if (gasStove1.getElectricBurners() != 0 && gasStove1.getIsTheElectricTurnOn() && gasStove1.getGazBurners() != 0){
            System.out.println("You turn on '" + gasStove1.getElectricBurners() + "' electric burners and energy disconnected from it is " + gasStove1.toCountEnergy());
        }else if (!gasStove1.getIsTheGasTurnOn() && !gasStove1.getIsTheElectricTurnOn()) {
            System.out.println("You haven't turned anything on and energy disconnected is " + gasStove1.toCountEnergy());
        }



        // Main method for sportsman
        int index = 1;
        Sportsman sportsman1 = new Sportsman(50, 60, 70, 80);
        Sportsman sportsman2 = new Sportsman(60, 70, 90, 80);
        Sportsman sportsman3 = new Sportsman(100, 55, 99, 60);
        Sportsman sportsman4 = new Sportsman(100, 55, 99, 60);
        Sportsman[] array = {sportsman1, sportsman2, sportsman3, sportsman4};
        for (int i = 0; i < array.length ; i++) {
            System.out.println("The 'sportsman" + index + "' score average is " + array[i].scoreAverage());
            index++;
        }
    }
}
