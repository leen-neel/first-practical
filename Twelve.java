import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Twelve {

    // This function checks if the given 2D array is symmetric or not
    public static boolean isSymmetric(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    // This function prints the sum of left and right diagonal of the array separately
    public static void printSumOfDiagonals(int[][] arr) {
        int n = arr.length;
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - i - 1];
        }
        System.out.println("Sum of left diagonal: " + sum1);
        System.out.println("Sum of right diagonal: " + sum2);
    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the size of the array : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter data for position (" + i + ", " + j + ") : ");
                arr[i][j] = Integer.parseInt(in.readLine());
            }
        }

        System.out.println();

        System.out.println(isSymmetric(arr) ? "The array is symmetric" : "The array is not symmetric");
        printSumOfDiagonals(arr);

    }

}

// Algorithm:
/**
 * Step 1: Start
 * Step 2: Read the size of the array
 * Step 3: Create a 2D array of size n
 * Step 4: Read the data for each position of the array
 * Step 5: Check if the array is symmetric or not
 * Step 6: Print the sum of left and right diagonal of the array separately
 * Step 7: End
 */
