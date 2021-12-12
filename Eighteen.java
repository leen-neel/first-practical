import java.io.BufferedReader;
import java.io.IOException;

public class Eighteen {
    
    public static String toPalindrome(String str) {        
        return str + new StringBuilder((str.substring(0, str.length() - 1))).reverse().toString();
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new java.io.InputStreamReader(System.in));

        System.out.print("Enter a string: ");
        String str = in.readLine();

        if (str.charAt(str.length() - 1) == '.' || str.charAt(str.length() - 1) == '?' || str.charAt(str.length() - 1) == '!' || Character.isLetterOrDigit(str.charAt(str.length() - 1))) {
            System.out.println();
            String[] words = str.split(" ");
            String palindrome = "";
            
            for (int i = 0; i < words.length; i++) {
                palindrome += toPalindrome(words[i]) + " ";
            }
    
            System.out.println(str);
            System.out.println(palindrome);;
        } else {
            System.out.println("Invalid input");
        }


    }

}
