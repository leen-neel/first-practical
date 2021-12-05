import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Eight {

    public static String[] combinations(int n) {

        String num = Integer.toString(n);

        String[] result = new String[num.length()];

        result[0] = num;

        for (int i = 1; i < result.length; i++) {

            char firstDeg = result[i - 1].charAt(0);
            String restDigs = result[i - 1].substring(0, result[i  - 1].length() - 1);

            result[i]  = firstDeg + restDigs;
                        
        }

        return result;
        
    }
    
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(in.readLine());

        

    }

}
