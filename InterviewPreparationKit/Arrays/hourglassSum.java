import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for(int rowNav = 0; rowNav < arr.length - 2; rowNav++){
            for(int colNav = 0; colNav < arr[0].length - 2; colNav++){
                int temp = 0;
                for(int row = rowNav; row < rowNav + 3; row++){
                    for(int col = colNav; col < colNav + 3; col++){
                        System.out.print(arr[row][col] + " ");
                        if((row - rowNav == 1 && col - colNav == 0) || (row - rowNav == 1 && col - colNav == 2)){}
                        else temp += arr[row][col];
                    }
                    System.out.println();
                }
                if(temp > max)
                    max = temp;
                System.out.println(max);
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
