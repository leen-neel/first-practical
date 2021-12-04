import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Five {

    public static boolean isMagic(int n) {
        
        int r = 1, sum = 0;
        int num = n;
        while (num > 9)
        {
            while (num > 0)
            {
                r = num % 10;
                sum = sum + r;
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }

        return num == 1;
        
    }

    public static boolean isComposite(int n) {

        int factors = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors++;
            }
        }

        return factors > 2;

    }

    public static void printValues(int m, int n) {

        int count = 0;

        for (int i = m; i <= n; i++) {
            if (isComposite(i) && isMagic(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println(count == 0 ? "\nInvalid input" : "\nFrequency of composite magic numbers is : " + count);

    }
    
   public static void main(String[] args) throws IOException {
       
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the lower limit : ");
        int m = Integer.parseInt(in.readLine());

        System.out.print("Enter the upper limit : ");
        int n = Integer.parseInt(in.readLine());

        printValues(m, n);

   } 

}

/**
 * isMagic(): 
 * Step 1: Loop through the number and find the sum of digits.
 * Step 2: If the sum of digits is 1, then the number is a magic number.
 * 
 * isComposite():
 * Step 1: Loop through the number and find the number of factors.
 * Step 2: If the number of factors is greater than 2, then the number is a composite number.
 * 
 * printValues():
 * Step 1: Loop through the numbers from m to n.
 * Step 2: If the number is composite and magic, then print it.
 * Step: Print the frequency of composite magic numbers.
 * 
 */
