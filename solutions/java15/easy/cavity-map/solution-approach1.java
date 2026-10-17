// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/mountblue-technologies/challenges/cavity-map/problem?isFullScreen=true
// Problem     Cavity Map
// Difficulty  Easy
// Subdomain   Algorithms
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-17, 09:34 p.m.
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
     * Complete the 'cavityMap' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY grid as parameter.
     */

public static List<String> cavityMap(List<String> grid) {
    
    List<String> originalGrid = new ArrayList<>(grid);
    
    for (int i = 1; i < grid.size() - 1; i++) {
        char[] rowChars = grid.get(i).toCharArray();
        
        for (int j = 1; j < rowChars.length - 1; j++) {
            
            char current = originalGrid.get(i).charAt(j);
            char left    = originalGrid.get(i).charAt(j - 1);
            char right   = originalGrid.get(i).charAt(j + 1);
            char top     = originalGrid.get(i - 1).charAt(j);
            char bottom  = originalGrid.get(i + 1).charAt(j);
            

            if (current > left && current > right && current > top && current > bottom) { 
                rowChars[j] = 'X'; 
            }
        }
        
        grid.set(i, new String(rowChars));
    }
    return grid;
}




}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> grid = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<String> result = Result.cavityMap(grid);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
