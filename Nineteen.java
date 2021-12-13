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