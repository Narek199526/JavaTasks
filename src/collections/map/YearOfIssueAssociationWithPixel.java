package collections.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class YearOfIssueAssociationWithPixel {
    public static void main(String[] args) {
        Monitor[] monitors = {
                new Monitor(120, 5000),
                new Monitor(100, 4500),
                new Monitor(90, 2000),
                new Monitor(150, 3000),
                new Monitor(160, 3500),
                new Monitor(200, 2500)
        };

        String [] strings = {"Samsung 2018", "Hisense 2019", "LG 2018", "Philips 2020", "Sony 2020", "Panasonic 2022"};

        TreeMap<Monitor, String> treeMap = new TreeMap<>();

        for (int i = 0; i < monitors.length; i++) {
            treeMap.put(monitors[i], strings[i]);
        }


        for (Monitor key : treeMap.keySet()) {
            System.out.println(treeMap.get(key) + ", diagonal-" + key.getDiagonal() + " pixel-" + key.getPixel());
        }

    }

}
