import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thirteen {

    public static int[][] makeMirrorImage(int[][] arr) {
        
        int[][] newArr = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                newArr[i][j] = arr[i][arr[0].length - j - 1];
            }
        }

        return newArr;

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

        System.out.println();

        System.out.println("Original array : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] mirrorArr = makeMirrorImage(arr);

        System.out.println();

        System.out.println("Mirror image of the array : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mirrorArr[i][j] + "\t");
            }
            System.out.println();
        }

    }
    
}

/**
 * main():
 * Step 1: Start
 * Step 2: Enter the size of the array
 * Step 3: Take the array as input
 * Step 4: Make the mirror image of the array
 * Step 5: Print the mirror image of the array
 * 
 * makeMirrorImage():
 * Step 1: Take the array as input
 * Step 2: Loop through the array
 * Step 3: Set the arr[i][arr[0].length - j - 1] element to the corresponding element in the new array
 * Step 4: Return the new array
 * 
 */
