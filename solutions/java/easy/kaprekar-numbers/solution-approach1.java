// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/mountblue-technologies/challenges/kaprekar-numbers/problem?isFullScreen=true
// Problem     Modified Kaprekar Numbers
// Difficulty  Easy
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-13, 01:04 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'kaprekarNumbers' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER p
     *  2. INTEGER q
     */

    public static void kaprekarNumbers(int p, int q) {
    boolean found = false;

    for (int i = p; i <= q; i++) {
        
        int d = String.valueOf(i).length();
        
        long square = (long) i * i;
        String sqStr = String.valueOf(square);
      
        String rightStr = sqStr.substring(sqStr.length() - d);
       
        String leftStr = sqStr.substring(0, sqStr.length() - d);
        
        
        int left = leftStr.isEmpty() ? 0 : Integer.parseInt(leftStr);
        int right = Integer.parseInt(rightStr);
        
        if (left + right == i) {
            System.out.print(i + " ");
            found = true;
        }
    }

    if (!found) {
        System.out.print("INVALID RANGE");
    }
   
}


}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        Result.kaprekarNumbers(p, q);

        bufferedReader.close();
    }
}
