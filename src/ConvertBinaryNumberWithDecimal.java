public class ConvertBinaryNumberWithDecimal {
    public static void main(String[] args) {
        int binaryArray[] = {0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1};
        int decimal = 0;
        int index = 0;
        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == 1) {
                if (i == binaryArray.length - 1 && binaryArray[i] == 1) {
                    decimal += 1;
                } else {
                    int binary = 1;
                    for (int j = 0; j < binaryArray.length - 1 - i; j++) {
                        binary *= 2;
                    }
                    decimal += binary;
                }
            }
        }
        System.out.println(decimal);
    }
}
