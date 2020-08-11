import java.util.*;
import java.io.*;
import java.math.*;


class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] pis = new int[N];
        for (int i = 0; i < N; i++) {
            pis[i] = in.nextInt();            
        }

        Arrays.sort(pis);
        
        int minDiff = 10_000_000; 
        for (int i = 1; i < pis.length; i++) {
            minDiff = Math.min(minDiff, pis[i] - pis[i-1]);      
        }

        System.out.println(minDiff);
        in.close();
    }
}