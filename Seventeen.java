import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class Seventeen {
    
    public static boolean isPalindrome(String str) {
        
        // Check if the string is a palindrome

        if (str.length() == 0 || str.length() == 1) {
            return false;
        }            

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
        
        ArrayList<String> palindromes = new ArrayList<String>();

        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                count++;
                palindromes.add(words[i]);
            }
        }

        if (count == 0) {
            System.out.println("No palindromes found.");
        } else {
            
            System.out.print("Palindromes : "); 
            for (String palindrome : palindromes) {
                System.out.print(palindrome + " ");
            }

            System.out.println("\nTotal palindrome words : " + count);
        }
    }

}

// Algorithm:
/**
 * Step 1: Start
 * Step 2: Read the input
 * Step 3: Split the input into words
 * Step 4: Check if the word is a palindrome
 * Step 5: If the word is a palindrome, increment the count
 * Step 6: If the count is 0, print "No palindromes found."
 * Step 7: If the count is not 0, print "Palindromes : " and the palindromes
 * Step 8: Print "Total palindrome words : " and the count
 * Step 9: End
 */
