package collections.map;

import java.util.LinkedHashMap;

public class ColorAssociationWithTriangle {
    static boolean comareTo(Object t,String color ){
        if (t.equals(color)){
            return true;
        } else
            return false;
    }


    public static void main(String[] args) {
        LinkedHashMap<Triangle , String > linkedHashMap = new LinkedHashMap<>();
        Triangle blackTriangle = new Triangle( 5, 1, 2, 3, 5, 9);
        Triangle redTriangle = new Triangle(3, 5, 6, 9, 4, 2);
        Triangle yellowTriangle = new Triangle(1, 6, 9, 4,3, 6);
        Triangle greenTriangle = new Triangle(4, 9, 7, 8, 5, 4);
        Triangle secondBlackTriangle = new Triangle(5, 6, 8, 5, 1, 80);

        linkedHashMap.put(blackTriangle, "Black");
        linkedHashMap.put(redTriangle, "Red");
        linkedHashMap.put(yellowTriangle, "Yellow");
        linkedHashMap.put(greenTriangle, "Green");
        linkedHashMap.put(secondBlackTriangle, "Black");
        System.out.println(linkedHashMap.get(blackTriangle));
        System.out.println(linkedHashMap.get(secondBlackTriangle));
        System.out.println(linkedHashMap.get(redTriangle));
        System.out.println(linkedHashMap.get(yellowTriangle));
        System.out.println(linkedHashMap.get(greenTriangle));

    }

}
