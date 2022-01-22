import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fourteen {

    public static void printArray(int[][] arr) {

        int n = arr.length;
        int m = arr[0].length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void printLargestSmallest(int[][] arr) {
        
        // Print the largest and smallest number from the array along with the row and column number
        int n = arr.length;
        int m = arr[0].length;

        int largest = arr[0][0];
        int smallest = arr[0][0];
        int largestRow = 0;
        int largestCol = 0;
        int smallestRow = 0;
        int smallestCol = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                    largestRow = i;
                    largestCol = j;
                }
                if (arr[i][j] < smallest) {
                    smallest = arr[i][j];
                    smallestRow = i;
                    smallestCol = j;
                }
            }
        }

        System.out.println("Largest number is " + largest + " at row " + largestRow + " and column " + largestCol);
        System.out.println("Smallest number is " + smallest + " at row " + smallestRow + " and column " + smallestCol);

    }

   // Sort the array in ascending order
   public static int[][] sortArray(int arr[][])
   {
       int m = arr.length, n = arr[0].length;
       for (int i = 0; i < m; i++)
       {
           for (int j = 0; j < n; j++)
           {
               for (int k = (i * n) + j + 1; k < (m * n); k++)
               {
                   if (arr[i][j] > arr[k / n][k % n])
                   {
                       int temp = arr[i][j];
                       arr[i][j] = arr[k / n][k % n];
                       arr[k / n][k % n] = temp;
                   }
               }
           }
       }
       return arr;
   }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number of rows in the array : ");
        int n = Integer.parseInt(in.readLine());

        System.out.print("Enter the number of columns in the array : ");
        int m = Integer.parseInt(in.readLine());

        if (n < 2 || n > 20 || m < 2 || m > 20) {
            System.out.println("Invalid input");
            return;
        }           

        System.out.println();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter data for position (" + i + ", " + j + ") : ");
                arr[i][j] = Integer.parseInt(in.readLine());
            }
        }

        System.out.println();

        printLargestSmallest(arr);

        System.out.println();

        printArray(sortArray(arr));
        
    }
    
}

// Algorithm
/**
 * Step 1: Start
 * Step 2: Print the largest and smallest number from the array along with the row and column number
 * Step 3: Sort the array in ascending order
 * Step 4: End
 */
