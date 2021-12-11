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

    public static int[][] sortArray(int[][] arr) {
        
        // Sort the array in ascending order
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = j + 1; k < m; k++) {
                    if (arr[i][j] > arr[i][k]) {
                        int temp = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = temp;
                    }
                }
            }
        }

        return arr;
        
    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the size of the array : ");
        int n = Integer.parseInt(in.readLine());

        if (n < 2 || n > 20) {
            System.out.println("Invalid input");
            return;
        }           

        System.out.println();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter data for position (" + i + ", " + j + ") : ");
                arr[i][j] = Integer.parseInt(in.readLine());
            }
        }
        
    }
    
}
