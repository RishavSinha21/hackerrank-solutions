// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/mountblue-technologies/challenges/drawing-book/problem?isFullScreen=true
// Problem     Drawing Book 
// Difficulty  Easy
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-01, 10:09 p.m.
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
    public static int pageCount(int n, int p) {
    int fromFront = p / 2;
    int fromBack = (n / 2) - fromFront;
    return Math.min(fromFront, fromBack);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
