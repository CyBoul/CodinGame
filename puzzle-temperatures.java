import java.util.*;
import java.io.*;
import java.math.*;


class Solution {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // the number of temperatures to analyse
        int closest = 5526;   // init with the maximum difference

        if ( n == 0 ) {
            System.out.println(n);
            return;
        } 
        
        for (int i = 0; i < n; i++) {
                int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
                if ( Math.abs( t ) < Math.abs(closest) || ((Math.abs( t ) == Math.abs(closest)) && (closest < t)) ){
                    closest = t;
                }
        }

        System.out.println(closest);
        in.close();
    }
}