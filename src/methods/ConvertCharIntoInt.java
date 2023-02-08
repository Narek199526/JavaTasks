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
        convertCharIntoInt(array);
        convertIntIntoChar(convertCharIntoInt(array));
        System.out.print("The initial array { ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("}");
        System.out.print("The received array from converting char into int { ");
        for (int i = 0; i < convertCharIntoInt(array).length; i++) {
            System.out.print(convertCharIntoInt(array)[i] + ", ");
        }
        System.out.println("}");
        System.out.print("The received array from converting int into char { ");
        for (int i = 0; i < convertIntIntoChar(convertCharIntoInt(array)).length; i++) {
            System.out.print(convertIntIntoChar(convertCharIntoInt(array))[i] + ", ");
        }
        System.out.println("}");
    }
}
