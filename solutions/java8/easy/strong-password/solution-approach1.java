// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/mountblue-technologies/challenges/strong-password/problem?isFullScreen=true
// Problem     Strong Password
// Difficulty  Easy
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-26, 09:51 p.m.
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

    public static int minimumNumber(int n, String password) {
        int count=0,l1=1,l2=1,l3=1,l4=1;
        for(char c:password.toCharArray()){
            int a=c;
            if((c>=97 && c<=122)){
                if(l1>0){
                    l1=0;
                }
                else{
                    continue;
                }
            }
            else if((c>=65 && c<=90)){
                 if(l2>0){
                    l2=0;
                }
                else{
                    continue;
                }
            }
            if((a>=48 && a<=57)){
                 if(l3>0){
                    l3=0;
                }
                else{
                    continue;
                }
            }
            if(((c>=33 && c<=45) || c==94 || c==64)){
                 if(l4>0){
                    l4=0;
                }
                else{
                    continue;
                }
            }
        }
            if((l1==0 && l2==0 && l3==0 && l4==0)){
                if(password.length()>6){
                    count=count;
                }
                else{
                    count=6-password.length();
                }
            }else{
                 count+=l1+l2+l3+l4;
                 if(password.length()>6){
                    count=count;
                 }else if((6-password.length())>count){
                    count=6-password.length();
                 }else{
                    count=count;
                 }
            }
        return count;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
