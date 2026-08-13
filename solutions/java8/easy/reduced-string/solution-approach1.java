// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/mountblue-technologies/challenges/reduced-string/problem?isFullScreen=true
// Problem     Super Reduced String
// Difficulty  Easy
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-13, 02:22 p.m.
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
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String superReducedString(String s) {
        Stack<Character> stack = new Stack<>();
        String a = "";
        stack.push(s.charAt(0));
        for (int x = 1; x < s.length(); x++) {
            if(!stack.isEmpty()){
                if(stack.peek()==s.charAt(x)){stack.pop();}
                else{stack.push(s.charAt(x));}
            }
            else{stack.push(s.charAt(x));
            }
        }
        if (stack.isEmpty()) {
            return "Empty String";
        } else {
            while(!stack.isEmpty()){
                a += stack.pop();
            }
        }
        return new StringBuilder(a).reverse().toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
