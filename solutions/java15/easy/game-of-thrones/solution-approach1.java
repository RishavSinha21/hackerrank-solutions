// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/mountblue-technologies/challenges/game-of-thrones/problem?isFullScreen=true
// Problem     Game of Thrones - I
// Difficulty  Easy
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-17, 03:37 p.m.
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
     * Complete the 'gameOfThrones' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

     public static String gameOfThrones(String s) {
     int c=0;
     HashMap<Character,Integer> map=new HashMap<>();
     for(int i=0;i<s.length();i++){
        char st=s.charAt(i);
        map.put(st,map.getOrDefault(st, 0)+1);
     }
     for(Map.Entry<Character,Integer> m:map.entrySet()){
        if(m.getValue()%2==0) c+=1;
     }
     if(c==map.size() || c==map.size()-1){ return "YES";}
       return "NO";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
