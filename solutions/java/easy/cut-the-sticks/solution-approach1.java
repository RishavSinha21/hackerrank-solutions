// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/mountblue-technologies/challenges/cut-the-sticks/problem?isFullScreen=true
// Problem     Cut the sticks
// Difficulty  Easy
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-13, 12:53 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'cutTheSticks' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

 public static List<Integer> cutTheSticks(List<Integer> arr) {
    List<Integer> list=new ArrayList<>();int sum=0,add=0;
    
    while(true){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.size();i++){
          if(arr.get(i)!=0){min=Math.min(min, arr.get(i));}
        }
        for(int h=0;h<arr.size();h++){
            if(arr.get(h)!=0) sum+=1;
        }if(sum==0){break;}
        list.add(sum);
        sum=0;
        for(int j=0;j<arr.size();j++){
            if(arr.get(j)==min){ arr.set(j, 0);} 
            else{
              if(arr.get(j)!=0){
                arr.set(j, arr.get(j)-min);
                }
              }
        }
        for(int h=0;h<arr.size();h++){
          add+=arr.get(h);
          }
        if(add==0){break;}
        add=0;
    }
    return list;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        List<Integer> result = Result.cutTheSticks(arr);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
