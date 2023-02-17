package javaClass.district;

public class Main {
    public static void main(String[] args) {
         Building building = new Building("monolitic", 6);
        Building[] buildings = {new Building("monolitic", 5),
                new Building("monolitcs", 7),
                new Building("concrete", 12),
                new Building("concrete", 18)
        };
        District district = new District(buildings, 166);
        System.out.println(district.availableArea());
        //building.theApartmentNumbers(building);
 //       int arr[] = new int[building.getNumbersOfTwoRoomApartment().length];
//        System.out.println(arr.length);
//        System.out.println(building.getFloorsOfBuildings());
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }
}
