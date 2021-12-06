import java.io.*;

public class Eleven {

    public static void getRowSum(int[][] arr) {
        
        int sumRow = 0;

        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 0; i < rows; i++) {
            sumRow = 0;

            for (int j = 0; j < cols; j++) {
                sumRow += arr[i][j];
            }

            System.out.println("The sum of row " + (i + 1 ) + " is : " + sumRow);
        }

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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        getRowSum(arr);

    }

}
