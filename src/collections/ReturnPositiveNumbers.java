package collections;

import java.util.ArrayList;
import java.util.List;

public class ReturnPositiveNumbers {
  static   ArrayList<Number> subArrayList = new ArrayList<>();


    static List<Number> positiveNumbers(ArrayList<? extends Number> arrayList){
        return subArrayList.subList(0, findNegativeNumber(arrayList));
    }

   static private int findNegativeNumber(ArrayList<? extends Number> arrayList){
        int index = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).doubleValue() < 0) {
                index = i;
                break;
            }
        }
        if (index < arrayList.size()){
            return index - 1;
        }else {
            return arrayList.size();
        }
    }
}
