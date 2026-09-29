// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/mountblue-technologies/challenges/marcs-cakewalk/problem?isFullScreen=true
// Problem     Marc's Cakewalk
// Difficulty  Easy
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-29, 02:50 p.m.
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
     * Complete the 'marcsCakewalk' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY calorie as parameter.
     */

    public static long marcsCakewalk(List<Integer> calorie) {
    Collections.sort(calorie);
    long sum=0,j=0;
    
    for(int i=calorie.size()-1;i>=0;i--){
        sum+=(Math.pow(2,j)*calorie.get(i));
        j++;
    }
    return sum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> calorie = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        long result = Result.marcsCakewalk(calorie);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
