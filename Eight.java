import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eight {

    // This function checks the number of factors of the number
    // If there are more than 2 factors then, the number is composite, else it's a
    // prime
    public static boolean isPrime(int n) {

        int factors = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors++;
            }
        }

        return factors == 2;

    }

    public static String[] combinations(int n) {

        String num = Integer.toString(n);

        String[] result = new String[num.length()];

        result[0] = num;

        for (int i = 1; i < result.length; i++) {

            char firstDeg = result[i - 1].charAt(0);
            String restDigs = result[i - 1].substring(0, result[i  - 1].length() - 1);

            result[i]  = firstDeg + restDigs;
                        
        }

        return result;
        
    }
    
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(in.readLine());

        String[] combinations = combinations(num);
        boolean isCircularPrime = false;
        
        for (int i = 0; i < combinations.length; i++) {
            if (isPrime(Integer.parseInt(combinations[i]))) {
                isCircularPrime = true;
            }
        }

        System.out.println(isCircularPrime ? num + " is a circular prime." : num + " isn't a circular prime");

    }

}

// Algorithm:
/**
 * Step 1: Start
 * Step 2: Get the number
 * Step 3: Get the number of digits
 * Step 4: Get the combinations of the number
 * Step 5: Check if the combinations are prime
 * Step 6: If the number is prime, then it's a circular prime
 * Step 7: If the number is not prime, then it's not a circular prime
 * Step 8: End
 */
