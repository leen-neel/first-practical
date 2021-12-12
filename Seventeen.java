import java.io.BufferedReader;
import java.io.IOException;

public class Seventeen {
    
    public static boolean isPalindrome(String str) {
        
        // Check if the string is a palindrome
        if (str.toUpperCase().equals(new StringBuilder(str.toUpperCase()).reverse().toString())) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new java.io.InputStreamReader(System.in));

        System.out.print("Enter a sentence : ");
        String str = in.readLine();

        System.out.println();
        String[] words = str.split(" ");
        int count = 0;

        System.out.print("Palindrome words : ");
        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                System.out.print(words[i] + " ");
                count++;
            }
        }

        System.out.println("\nTotal palindrome words : " + count);

    }

}
