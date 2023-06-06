package collections.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class YearOfIssueAssociationWithPixel {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor(120, 5000);
        Monitor monitor2 = new Monitor(100, 4500);
        Monitor monitor3 = new Monitor(90, 2000);
        Monitor monitor4 = new Monitor(150, 3000);
        Monitor monitor5 = new Monitor(160, 3500);
        Monitor monitor6 = new Monitor(200, 2500);
        TreeMap<Monitor, String> treeMap = new TreeMap<>();
        treeMap.put(monitor1, "Samsung 2018");
        treeMap.put(monitor2, "Hisense 2019");
        treeMap.put(monitor3, "LG 2018");
        treeMap.put(monitor4, "Philips 2020");
        treeMap.put(monitor5, "Sony 2020");
        treeMap.put(monitor6, "Panasonic 2022");


//        Set<Map.Entry<String, Monitor>> entries = treeMap.entrySet();
//        entries.forEach(stringMonitorEntry -> {
//            System.out.println(stringMonitorEntry.getKey() + "->" +stringMonitorEntry.getValue() );
//        });
        for (Monitor key:treeMap.keySet()) {
            System.out.println(treeMap.get(key) + ", diagonal-" + key.getDiagonal() + " pixel-" + key.getPixel());
        }


    }

}
