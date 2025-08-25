/** Write a Java program to reverse each word in a string while keeping the word order same.
Example:

Input: "Java is very simple"
Output: "avaJ si yrev elpmis"*/
import java.lang.String;
class Reverse {
    private String str;
    private String result = "";

    public Reverse(String str) {
        this.str = str;
        String word = "";

      
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                result += reverseWord(word) + " ";
                word = ""; 
            } else {
                word += ch; 
            }
        }

        
  result += reverseWord(word);
    }


    private String reverseWord(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }

    public void revString() {
        System.out.println(result);
    }
}

class Main {
    public static void main(String args[]) {
        String str = "Java is very simple";
        Reverse r = new Reverse(str);
        r.revString();
    }
}