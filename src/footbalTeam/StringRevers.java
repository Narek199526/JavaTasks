package footbalTeam;

public class StringRevers {
    public static void main(String[] args) {
        // Revers text with for cycle
        String text = "Hello java";
        String revertedText = "";
        for (int i = text.length() - 1; i >= 0 ; i--) {
            revertedText += text.charAt(i);
        }
        System.out.println(revertedText);


        // Revers text with recursion
        System.out.println("\n");
        String revertStringWithRecursion = revert(text);
        System.out.println(revertStringWithRecursion);
    }
  static String revert(String text){
        if (text.length() <= 1){
            return text;
        }
        return text.charAt(text.length() - 1) +  revert(text.substring(0, text.length() - 1));

  }
}
