// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/mountblue-technologies/challenges/counting-valleys/problem?isFullScreen=true
// Problem     Counting Valleys
// Difficulty  Easy
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-15, 02:59 p.m.
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
    public static int countingValleys(int steps, String path) {
       int c=0,up=0,down=0,i=0,sum=0;
    //    if(path.length()==2 && path.charAt(0)=='U'){return 0;}
       while(i<steps-1){
        if(path.charAt(i)=='U'){ 
            up+=1; 
        }
        else{
            down+=1;
        }
        i++;
        while(down > up) {
        
        if(path.charAt(i)=='U'){ 
            up+=1; 
        }
        else{
            down+=1;
        }
        i++;
        if(up-down==0){
            c+=1;
        }
        } 
      }
      return c;
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
