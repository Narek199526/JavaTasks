package methods;

public class FindTheWordInTheText {
    public static void main(String[] args) {
        String text = " concepts related to Java Programming Java including What is Java";
        String word = "y";
        int count = findTeWord(word, text);
        if (count == -1 || count == 0) System.out.println("A word '" + word + "' is never repeated");
            else if (count == -2) System.out.println("Text or word for compare is empty");
         else if (count > 0) System.out.println("The '" + word + "' word repeated " + count + " times");
    }

    static int findTeWord(String word, String text) {
        int count = 0;
        if (text.length() > 0 && word.equals("") == false) {
            for (String compareWord : text.split(" ")) {
                if (compareWord.equals(word))
                    count++;
            }
            return count;
        }
        else if (text.isEmpty() || word.equals(""))
            return -2;
        else
            return -1;
    }
}
