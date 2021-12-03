import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One {
    public static boolean isPrime(int n) {
        // This function returns if a number is a prime number or not
        int flag = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }
        return flag == 0;        
    }

    public static boolean isPalindrome(int n) {
        // This function returns if a number is a palindrome or not
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            sum = sum * 10 + temp % 10;
            temp = temp / 10;
        }
        return sum == n;
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the upper limit: ");
        int m = Integer.parseInt(in.readLine());
        
        System.out.print("Enter the lower limit : ");
        int n = Integer.parseInt(in.readLine());

        int count = 0;
        if (m < 3000 && n < 3000) {
            for (int i = n; i <= m; i++) {
                if (isPrime(i) && isPalindrome(i)) {
                    count++;
                }
            }
        } else {
            System.out.println("Invalid input");
            System.exit(0);
        }
        
        System.out.println("The count is : " + count);

    }    
}
