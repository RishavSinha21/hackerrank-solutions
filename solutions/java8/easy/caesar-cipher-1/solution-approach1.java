// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/mountblue-technologies/challenges/caesar-cipher-1/problem?isFullScreen=true
// Problem     Caesar Cipher
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-16, 07:25 p.m.
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
    public static String caesarCipher(String s, int k) {
        String str="";
        int a=0,b=0;
        for(char c:s.toCharArray()){
        if(k==0){
            return s;
        }
        else if(c>=97 && c<=122){
             if(k<26){                 
                 b=c+(k%26);
                  if(b>122){
                    a=96+Math.abs(Math.abs(122-c)-(k%26));
                  }
                  else{
                    a=c+Math.abs(k%26);
                  }
                 str+=(char)a;
             }
             else{
                  b=c+(k%26);
                  if(b>122){
                    a=96+Math.abs(Math.abs(122-c)-(k%26));
                  }
                  else{
                    a=c+Math.abs(k%26);
                  }
                 str+=(char)a;
             }
        }
        else if(c>=65 && c<=90){
              if(k<26){                 
                  b=c+(k%26);
                  if(b>90){
                    a=64+Math.abs(Math.abs(90-c)-(k%26));
                  }
                  else{
                    a=c+Math.abs(k%26);
                  }
                  str+=(char)a;
              }
              else{
                  b=c+(k%26);
                  if(b>90){
                    a=64+Math.abs(Math.abs(90-c)-(k%26));
                  }
                  else{
                    a=c+Math.abs(k%26);
                  }
                 str+=(char)a;
              }
                      }
        else if((32<=c && c<=47)| (58<=c && c<= 64) |(91<=c && c<= 96) |(123<=c && c<= 126)){
            str+=c;
        }
        else if(48<=c && c<=57){
            str+=c;
        }
        }
        return str;
    }
}           

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
