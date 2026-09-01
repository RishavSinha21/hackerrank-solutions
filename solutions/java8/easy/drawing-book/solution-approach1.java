// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/mountblue-technologies/challenges/drawing-book/problem?isFullScreen=true
// Problem     Drawing Book 
// Difficulty  Easy
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-01, 10:11 p.m.
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
        int flip=0,half=0;
        if( n-p==1 && n>2){ 
        return (n%2==0)? 1 : 0;
        }
        else if(n==2){
            return p<n ?0 :1;
        } else if( p==n | p==1){
            return 0;
        }
        else if(n>2 && p==2 | p==n-1){
            return 1;
        }
        else{
            half=n/2;
            if(p>half){
             flip=(n-p)/2;
            }
            else{
                if((p-1)%2==0){
                    flip=(p-1)/2;
                }
                else{
                    flip=Math.round((p-1)/2)+1;
                }
            }
        }return flip; 
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
