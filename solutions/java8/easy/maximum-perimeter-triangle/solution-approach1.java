// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/mountblue-technologies/challenges/maximum-perimeter-triangle/problem?isFullScreen=true
// Problem     Maximum Perimeter Triangle
// Difficulty  Easy
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-10-05, 12:34 a.m.
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

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        List<Integer> list=new ArrayList<>();
        if(sticks.size()<3){list.add(-1);return list;}
        Collections.sort(sticks);
        int max=0;
        for(int i=0;i<sticks.size()-2;i++){
               int a=sticks.get(i);
               int b=sticks.get(i+1);
               int c=sticks.get(i+2);
               if(a+b>max && a+b>c){
                list.clear();
                max=a+b;
                list.add(a);list.add(b);list.add(c);
               }
           }
        if(!list.isEmpty()) return list;
        else{list.add(-1); return list;}
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> sticks = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.maximumPerimeterTriangle(sticks);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
