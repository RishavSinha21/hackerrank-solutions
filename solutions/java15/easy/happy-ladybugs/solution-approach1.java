// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/mountblue-technologies/challenges/happy-ladybugs/problem?isFullScreen=true
// Problem     Happy Ladybugs
// Difficulty  Easy
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-17, 04:12 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'happyLadybugs' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING b as parameter.
     */
    public static String happyLadybugs(String b) {
        int[] counts = new int[26];
        boolean hasEmptyCell = false;

        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            if (ch == '_') {
                hasEmptyCell = true;
            } else {
                counts[ch - 'A']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (counts[i] == 1) {
                return "NO";
            }
        }
        if (hasEmptyCell) {
            return "YES";
        }
        for (int i = 0; i < b.length(); i++) {
            char current = b.charAt(i);
            boolean leftSame = (i > 0 && b.charAt(i - 1) == current);
            boolean rightSame = (i < b.length() - 1 && b.charAt(i + 1) == current);
            if (!leftSame && !rightSame) {
                return "NO";
            }
        }

        return "YES";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, g).forEach(gItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                String b = bufferedReader.readLine();

                String result = Result.happyLadybugs(b);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
