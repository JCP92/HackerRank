import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        // initialize hashtable as Key to word and integer to number of times used
        Hashtable<String, Integer> Mag = new Hashtable<String, Integer>(magazine.length);
        
        //turn magazine array into hash map
        for(String i : magazine){
            if(Mag.get(i) != null)// checks for already created
                Mag.put(i, Mag.get(i) + 1);// if created counts
            else Mag.put(i, 1);// if not created, create and initialize value to 1
        }

        for(String word : note){
            if(Mag.get(word) != null && Mag.get(word) > 0){
                Mag.put(word, Mag.get(word) - 1);
            }else{
                System.out.print("No");
                return;
            } 
        }
        System.out.print("Yes");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
