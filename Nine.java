import java.io.*;

class Nine {
   
    public static int sum(int i,int num) {
        int s1=0;
        for(int x=i;s1<num;x++) {         
            s1 = s1 + x;
        }
        return (s1);
    }

    public static void main(String args[]) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a number : ");
        int n = Integer.parseInt(in.readLine());

        int s;

        for(int j = 1; j <= n; j++) {    
            int ans = sum(j,n);
            s = 0;

            if(ans == n) {
                for(int y = j; s < n; y++) {
                    s = s + y;
                    System.out.print(y + " ");
                }
                System.out.println();
            }
        }
    }
}

// Algorithm:
/**
 * Step 1: Start
 * Step 2: Initialize sum variable
 * Step 3: Loop through the numbers from 1 to n
 * Step 4: Add the numbers from 1 to n
 * Step 5: If the sum is equal to n, print the numbers
 * Step 6: End
 */
