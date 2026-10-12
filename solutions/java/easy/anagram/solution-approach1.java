// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/mountblue-technologies/challenges/anagram/problem?isFullScreen=true
// Problem     Anagram
// Difficulty  Easy
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-12, 03:46 p.m.
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
     * Complete the 'anagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

public static int anagram(String s) {

    if (s.length() % 2 != 0) {
        return -1;
    }
  
    String s1 = s.substring(0, s.length() / 2);
    String s2 = s.substring(s.length() / 2);

    int[] counts = new int[26];
    for (char c : s1.toCharArray()) {
        counts[c - 'a']++;
    }

    int changesRequired = 0;
    for (char c : s2.toCharArray()) {
        if (counts[c - 'a'] > 0) {
            counts[c - 'a']--;
        } else {
            changesRequired++;
        }
    }
    
    return changesRequired;
}


}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            int result = Result.anagram(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
