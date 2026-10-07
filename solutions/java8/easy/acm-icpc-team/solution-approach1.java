// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/mountblue-technologies/challenges/acm-icpc-team/problem?isFullScreen=true
// Problem     ACM ICPC Team
// Difficulty  Easy
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-10-07, 08:06 p.m.
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
class Pair{
    int a;
    int b;
    Pair(int a,int b){
        this.a=a;
        this.b=b;
    }
}
class Result {

    public static List<Integer> acmTeam(List<String> topic) {
        int max=0;int sum=0,count=0,k=0;
        List<List<Character>> list=new ArrayList<>();
        HashMap<Pair,Integer> map=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
    for(int i=0;i<topic.size();i++){
        List<Character> list1=new ArrayList<>();
        for(char c:topic.get(i).toCharArray()){
            list1.add(c);
        }
        list.add(list1);
    }
     for(int i=0;i<list.size()-1;i++){ k=i+1;
            while(k<list.size()){ 
                for(int j=0;j<list.get(i).size();j++){ 
                    if(list.get(i).get(j)=='1' || list.get(k).get(j)=='1') count+=1; 
                }k++; 
                map.put(new Pair(i,k),count); 
                max=Math.max(max,count); 
                count=0; 
            } 
        } 
        for(Map.Entry<Pair,Integer> m:map.entrySet()){ 
            if(m.getValue()==max) sum+=1; 
        } 
        ans.add(max); 
        ans.add(sum); 
        return ans;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<String> topic = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> result = Result.acmTeam(topic);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
