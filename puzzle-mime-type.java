import java.util.*; 
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.

        Map<String, String> map = new HashMap<>(N);

        for (int i = 0; i < N; i++) {
            map.put(in.next().toLowerCase(), in.next());
        }

        in.nextLine();

        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            String[] s = FNAME.split("\\.");

            String display = s.length >= 2 && FNAME.matches("(.*)\\.([a-zA-Z0-9]+)")
                                && map.containsKey(s[(s.length - 1)].toLowerCase()) 
                                ? map.get(s[(s.length - 1)].toLowerCase()) : "UNKNOWN";

            System.out.println( display ); 
        }

        in.close();
    }
}