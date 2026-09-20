// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/mountblue-technologies/challenges/day-of-the-programmer/problem?isFullScreen=true
// Problem     Day of the Programmer
// Difficulty  Easy
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-21, 12:13 a.m.
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
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
        int day;
        if (year == 1918) {
            return "26.09.1918";
        }
        if (year < 1918) {
            day = (year % 4 == 0) ? 12 : 13;
        }
        else {
            day = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                    ? 12 : 13;
        }
        return day + ".09." + year;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
