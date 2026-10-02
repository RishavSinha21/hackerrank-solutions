// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/mountblue-technologies/challenges/separate-the-numbers/problem?isFullScreen=true
// Problem     Separate the Numbers
// Difficulty  Easy
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-10-03, 03:29 a.m.
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

    public static void separateNumbers(String s) {

        // Cannot start with 0 or contain only one digit
        if (s.length() == 1 || s.charAt(0) == '0') {
            System.out.println("NO");
            return;
        }

        // Try every possible length for the first number
        for (int len = 1; len <= s.length() / 2; len++) {

            String str = s.substring(0, len);
            long first = Long.parseLong(str);

            int index = len;
            long previous = first;

            while (index < s.length()) {

                
                int nextLength = String.valueOf(previous + 1).length();

                if (index + nextLength > s.length()) {
                    break;
                }

                String str1 = s.substring(index, index + nextLength);
                long current = Long.parseLong(str1);

                if (current != previous + 1) {
                    break;
                }

                previous = current;
                index += nextLength;
            }

            if (index == s.length()) {
                System.out.println("YES " + first);
                return;
            }
        }

        System.out.println("NO");
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                Result.separateNumbers(s);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
