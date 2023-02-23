package oldTasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestArray {
    public static void main(String[] args) {
        int longestArray[][] = {{12, 2, 3, 6, 8}, {5, 6, 8, 50} , {8, 6, 2, 3}};
        int longestArrayLength = longestArray[0].length;
        int num = 0;
        for (int i = 1; i < longestArray.length; i++) {
            if (longestArray[i].length > longestArrayLength) {
                longestArrayLength = longestArray[i].length;
                num = i;
            }
        }
        System.out.print("The longest array members are ");
        for (int i = 0; i < longestArrayLength; i++) {
            System.out.print(longestArray[num][i] + " ");
        }
    }
}
