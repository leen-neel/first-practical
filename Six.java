import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Six {

    public static boolean isPrime(int n) {

        int factors = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors++;
            }
        }

        return factors == 2;

    }

    public static int reverseNumber(int n) {
        
        int reverse = 0;
        int temp = n;

        while (temp != 0) {
            reverse = reverse * 10;
            reverse = reverse + temp % 10;
            temp = temp / 10;
        }

        return reverse;

    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int n = Integer.parseInt(in.readLine());

        System.out.println("Reverse number : " + reverseNumber(n));

        if (isPrime(n) && isPrime(reverseNumber(n))) {
            System.out.println(n + " is a reversable prime.");
        } else {
            System.out.println(n + " is not a reversable prime.");
        }

    }
    
}

// Algorithm:
/**
 * Step 1: Start
 * Step 2: Read input
 * Step 3: Reverse the number
 * Step 4: Check if the number is prime
 * Step 5: Check if the reverse number is prime
 * Step 6: Print the result
 * Step 7: End
 */
