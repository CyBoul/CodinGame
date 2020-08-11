import java.util.*;
import java.io.*;
import java.math.*;
 
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int heighest = 0; 
            int index = 0;
            for (int i = 0; i  8; i++) {
                int mountainH = in.nextInt();  
                if (mountainH  heighest){
                    heighest = mountainH;
                    index = i;
                }
            }

            System.out.println(index);  
        }
    }
}