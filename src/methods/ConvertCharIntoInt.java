package methods;

public class ConvertCharIntoInt {

    static int[] convertCharIntoInt(char[] array){
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        return arr;
    }
    static char[] convertIntIntoChar(int[] array){
        char[] arr = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = (char) array[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        char[] array ={'a', 'g', '#', 'j', 'a'};
        boolean cnd = true;
        int[] convertArrayCharIntoInt = convertCharIntoInt(array);
        char[] convertArrayIntIntoChar = convertIntIntoChar(convertArrayCharIntoInt);
//        System.out.print("The initial array { ");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + ", ");
//        }
//        System.out.println("}");
//        System.out.print("The received array from converting char into int { ");
//        for (int i = 0; i < convertArrayCharIntoInt.length; i++) {
//            System.out.print(convertArrayCharIntoInt[i] + ", ");
//        }
//        System.out.println("}");
//        System.out.print("The received array from converting int into char { ");
//        for (int i = 0; i < convertArrayIntIntoChar.length; i++) {
//            System.out.print(convertArrayIntIntoChar[i] + ", ");
//        }
//        System.out.println("}");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != convertArrayIntIntoChar[i]){
                cnd = false;
                break;
            }
        }
        if (cnd){
            System.out.println("your code works");
        }else {
            System.out.println("your code does not work");
        }

    }
}
