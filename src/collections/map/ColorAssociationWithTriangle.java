package collections.map;

import java.util.LinkedHashMap;

public class ColorAssociationWithTriangle {
    public static void main(String[] args) {
        int index = 0;

        LinkedHashMap<Triangle, String> linkedHashMap = new LinkedHashMap<>();

        Triangle[] triangles = {
                new Triangle(5, 1, 2, 3, 5, 9),
                new Triangle(3, 5, 6, 9, 4, 2),
                new Triangle(1, 6, 9, 4, 3, 6),
                new Triangle(4, 9, 7, 8, 5, 4),
                new Triangle(5, 6, 8, 5, 1, 80)
        };


        String[] strings = {"Black", "Red", "Yellow", "Green", "Black"};
        for (int i = 0; i < triangles.length; i++) {
            linkedHashMap.put(triangles[i], strings[i]);
        }


        for (Triangle t : linkedHashMap.keySet()) {
            if (linkedHashMap.get(t).equals(strings[index])) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
            index++;
        }

    }

}
