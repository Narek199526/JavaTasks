public class ConvertBinaryNumberWithDecimal {
    public static void main(String[] args) {
        int binaryArray[] = {0, 0, 1,};
        int decimal = 0;
        for (int i = 0; i < binaryArray.length; i++) {
            decimal = decimal * 2 +binaryArray[i];
        }
        System.out.println("The corresponding decimal number is " + decimal);
    }
}
