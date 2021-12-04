import java.io.*;

public class Seven {

    public static int numOf1s(String n) {
        
        int count = 0;

        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '1') {
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(in.readLine());

        if (num > 2 && num < 100) {
            String binary = Integer.toBinaryString(num);

            System.out.println();
    
            System.out.println("Binary equivalent : " + binary);
            System.out.println("Number of 1s : " + numOf1s(binary));
            System.out.println(numOf1s(binary) % 2 == 0 ? "Evil number" : "Not an evil number");
        } else {
            System.out.println("Number out of range");
        }

    }
    
}

/**
 * 
 * numOf1s():
 * Step 1: Loop through the string
 * Step 2: If the character is 1, increment the count
 * Step 3: Return the count
 * 
 * main():
 * Step 1: Read the number from the user
 * Step 2: If the number is between 2 and 100, convert it to binary and print the result
 * Step 3: If the number is not between 2 and 100, print "Number out of range"
 * 
 */
