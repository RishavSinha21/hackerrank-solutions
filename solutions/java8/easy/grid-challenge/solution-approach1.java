// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/mountblue-technologies/challenges/grid-challenge/problem?isFullScreen=true
// Problem     Grid Challenge
// Difficulty  Easy
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-30, 06:09 p.m.
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
 public static String gridChallenge(List<String> grid) {
        List<List<Integer>> list = new ArrayList<>();
        String str = "";
        int g=1,p=0;

        for (int i = 0; i < grid.size(); i++) {
            str += grid.get(i);
            List<Integer> li = new ArrayList<>();
            for (char c : str.toCharArray()) {
                int a = c;
                li.add(a);
            }
            str="";
            Collections.sort(li);
            list.add(li);
            
        }
        while(g<list.size()){
          while(p<list.get(g-1).size()){
            if(list.get(g-1).get(p)<list.get(g).get(p) || list.get(g-1).get(p)==list.get(g).get(p)){
                p++;
            }
            else{
                return "NO";
            }
            
        }
        g++;
        p=0;
        }
        return "YES";
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<String> grid = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                    .collect(toList());

                String result = Result.gridChallenge(grid);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
