import java.io.*;

public class Nineteen {

    public static void main(String args[]) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number of teams : ");
        int n = Integer.parseInt(in.readLine());
        
        if (n <= 2 || n >= 9) {
            System.out.println("Invalid input");
            return;
        }
        
        String teams[] = new String[n];
        int highLen = 0;
        
        for (int i = 0; i < n; i++) {
             System.out.print("Team " + (i+1) + ": ");
             teams[i] = in.readLine();
             if (teams[i].length() > highLen) {
                 highLen = teams[i].length();
             }
        }

        System.out.println();
        
        for (int i = 0; i < highLen; i++) {
            for (int j = 0; j < n; j++) {
                int len = teams[j].length();
                if (i >= len) {
                    System.out.print(" \t");
                }
                else {
                    System.out.print(teams[j].charAt(i) + "\t");
                }
            }
            System.out.println();
        }
    }

}

// Algoorithm
/**
 * Step 1: Start
 * Step 2: Read the number of teams
 * Step 3: Check if the number of teams is valid
 * Step 4: Read the names of the teams
 * Step 5: Find the longest name
 * Step 6: Print the names in the format
 * Step 7: End
 */
