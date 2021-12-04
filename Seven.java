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

        String binary = Integer.toBinaryString(num);

        System.out.println();

        System.out.println("Binary equivalent : " + binary);
        System.out.println("Number of 1s : " + numOf1s(binary));
        System.out.println(numOf1s(binary) % 2 == 0 ? "Evil number" : "Not an evil number");

    }
    
}
