import java.io.*;

public class Fifteen {

    public static void sortArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            } 
        }
    }
    
    public static void main(String args[]) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the size of array: ");
        int n = Integer.parseInt(in.readLine());
        
        if (n <= 2 || n >= 10) {
            System.out.println("Invalid input");
            return;
        }
        
        int a[] = new int[n];
        int b[][] = new int[n][n];
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value for position " + i + " : ");
            a[i] = Integer.parseInt(in.readLine());
        }

        System.out.println();
        
        sortArray(a);
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        
        for (int i = n - 1, r = 0; i >= 0; i--, r++) {
            for (int j = 0; j <= i; j++) {
                b[r][j] = a[j];
            }
            
            for (int k = n - 1; k > i; k--) {
                b[r][k] = a[k - i - 1];
            }
        }
        
        System.out.println();
        System.out.println("Filled matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Algorithm
/**
 * Step 1: Start
 * Step 2: Sort the array
 * Step 3: Create a matrix of size n x n
 * Step 4: Fill the matrix with the sorted array
 * Step 5: Print the matrix
 * Step 6: End
 */
