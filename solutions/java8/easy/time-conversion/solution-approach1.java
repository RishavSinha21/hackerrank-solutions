// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/mountblue-technologies/challenges/time-conversion/problem?isFullScreen=true
// Problem     Time Conversion
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-15, 05:51 p.m.
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
import java.util.Calendar;
import java.util.Date;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {


    public static String timeConversion(String s) {
        String b="";StringBuilder sb=new StringBuilder(s);
        if(s.charAt(s.length()-2)=='P'){
            b=sb.charAt(0)+b+sb.charAt(1);
            if(!b.equals("12")){
            int conv=12+Integer.parseInt(b);
            b=String.valueOf(conv);char o=b.charAt(0);char p=b.charAt(1);
            sb.setCharAt(0,o);
            sb.setCharAt(1,p);
            return sb.substring(0, sb.length()-2);
            }else{
                return sb.substring(0, sb.length()-2); 
            }
        }else{
            b=sb.charAt(0)+b+sb.charAt(1);
            if(b.equals("12")){
            int conv=12-Integer.parseInt(b);
            b="0";
            b=b+String.valueOf(conv);
            char o=b.charAt(0);
            char p=b.charAt(1);
            sb.setCharAt(0,o);
            sb.setCharAt(1,p);
            return sb.substring(0, sb.length()-2);
            }
            else{
                return sb.substring(0, sb.length()-2);
            }
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
