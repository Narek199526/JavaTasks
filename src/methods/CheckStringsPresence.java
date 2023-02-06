package methods;

public class CheckStringsPresence {
    public static void main(String[] args) {
        String text = "string";
        int count = findStringWord(text);
        if (count == -1) System.out.println("A word 'string' is never repeated");
        else if (count == -2) System.out.println("Text is empty");
        else if (count > 0) System.out.println("The 'string' word repeated " + count + " times");
    }

    static int findStringWord(String text) {
        int count = 0;
        for (String compareWord : text.split(" ")) {
            if (compareWord.equals("string"))
                count++;
        }
        if (count > 0) return count;
        else if (text.isEmpty()) return -2;
        else return -1;
    }
}
