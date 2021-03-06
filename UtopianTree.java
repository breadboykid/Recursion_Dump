package utopiantree;

//Challenge from hackerrank. My version of the utopian tree.: tree grows 1m every summer and doubles every spring. User enters period to calculate tree height.
//e.g. int t = 3 would represent spring>summer>spring (i.e 3 periods.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UtopianTree{

    // Custom method
    static int utopianTree(int n){
        if(n ==0){
            return 1;
        }else if(n%2 == 0){
            return utopianTree(n-1) + 1;
        }else{
            return utopianTree(n-1) * 2;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

//main method forked from Hackerrank
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = utopianTree(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
