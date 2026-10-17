// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/mountblue-technologies/challenges/sherlock-and-the-beast/problem?isFullScreen=true
// Problem     Sherlock and The Beast
// Difficulty  Easy
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-17, 03:19 p.m.
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
     * Complete the 'decentNumber' function below.
     *
     * The function accepts INTEGER n as parameter.
     */
public static void decentNumber(int n) {
    int countOf5s = n;

    while (countOf5s % 3 != 0) {
        countOf5s -= 5;
    }
    if (countOf5s < 0) {
        System.out.println("-1");
    } else {
        int countOf3s = n - countOf5s;
        StringBuilder decentNumber = new StringBuilder();
 
        for (int i = 0; i < countOf5s; i++) {
            decentNumber.append("5");
        }

        for (int i = 0; i < countOf3s; i++) {
            decentNumber.append("3");
        }
        
        System.out.println(decentNumber.toString());
    }
}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            Result.decentNumber(n);
        }

        bufferedReader.close();
    }
}
