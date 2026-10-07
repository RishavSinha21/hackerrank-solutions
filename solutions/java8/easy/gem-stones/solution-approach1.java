// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/mountblue-technologies/challenges/gem-stones/problem?isFullScreen=true
// Problem     Gemstones
// Difficulty  Easy
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-10-07, 05:06 p.m.
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
     * Complete the 'gemstones' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY arr as parameter.
     */

       public static int gemstones(List<String> arr) {
    
    List<List<Character>> list=new ArrayList<>();
    HashMap<Character,Integer> hmap=new HashMap<>();
    int count=0;
    for(int i=0;i<arr.size();i++){
        List<Character> list1=new ArrayList<>();
        for(char c:arr.get(i).toCharArray()){
            
            if(hmap.get(c)==null){
              hmap.put(c,hmap.getOrDefault(c,0)+1);
                list1.add(c);
            }
        }hmap.clear();
        list.add(list1);
    }
    hmap.clear();
    for(int i=0;i<list.size();i++){
       for(char c:list.get(i)){
        hmap.put(c,hmap.getOrDefault(c, 0)+1);
       }
    }
    for(Map.Entry<Character,Integer> m:hmap.entrySet()){
        if(m.getValue()==arr.size()) count+=1;
    }
    return count;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arr = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int result = Result.gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
