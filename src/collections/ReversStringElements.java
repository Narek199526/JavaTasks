package collections;

public class ReversStringElements {
    static String reversWord(String word){
        String reversWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversWord += word.charAt(i);
        }
        return reversWord;
    }



    static String[] splitText(String sentence){
       return sentence.split(" ");
    }



    static String reversText( String  text){
        String[] splitText = splitText(text);
        String reversText = "";
        for (int i = 0; i < splitText.length; i++) {
            reversText += reversWord(splitText[i]) + " ";
        }
        return reversText.toString();
    }



    public static void main(String[] args) {
        String text = "This code is work";
       String reversesText  = reversText(text);
        System.out.println(reversesText);
    }
}
