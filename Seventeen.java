public class Seventeen {
    
    public static boolean isPalindrome(String str) {
        
        // Check if the string is a palindrome
        if (str.equals(new StringBuilder(str).reverse().toString())) {
            return true;
        } else {
            return false;
        }

    }

}
