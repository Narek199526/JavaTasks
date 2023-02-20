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

    }
}
