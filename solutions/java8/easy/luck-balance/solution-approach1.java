// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/mountblue-technologies/challenges/luck-balance/problem?isFullScreen=true
// Problem     Luck Balance
// Difficulty  Easy
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-10-06, 10:04 p.m.
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
     * Complete the 'luckBalance' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. 2D_INTEGER_ARRAY contests
     */

    public static int luckBalance(int n,int k, List<List<Integer>> contests) {
    List<Integer> list=new ArrayList<>();int sum=0,sum1=0,sum2=0,c=0;
     for(int i=0;i<n;i++){
        if(contests.get(i).get(1)==0){
            c+=1;
        }
      }
      if(c==contests.size()){
        for(int i=0;i<n;i++){
        sum+=contests.get(i).get(1);
        sum2+=contests.get(i).get(0);
        list.add(contests.get(i).get(0));
        }
        return sum2;
      }else{
        for(int i=0;i<n;i++){
        sum+=contests.get(i).get(1);
        sum2+=contests.get(i).get(0);
        if(contests.get(i).get(1)==1){list.add(contests.get(i).get(0));}
    }
    }
    Collections.sort(list);
    int a=list.size()-k;
    for(int i=0;i<a;i++){
           sum1+=list.get(i);
       
    }
    sum=sum2-(2*sum1);
    return sum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> contests = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                contests.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.luckBalance(n,k, contests);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
