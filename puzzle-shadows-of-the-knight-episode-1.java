import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();

        int goX = 0, goY = 0, minX = 0, minY = 0;
        int maxX = W-1, maxY = H-1;
        
        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)

            if ( bombDir.indexOf("U") > -1 || bombDir.indexOf("D") > -1 ){
                maxY = ( bombDir.indexOf("U") > -1 ) ? Y0 - 1 : maxY;
                minY = ( bombDir.indexOf("D") > -1) ? Y0 + 1 : minY;
                goY = minY + ((maxY - minY) / 2); 
            }

            if ( bombDir.indexOf("R") > -1 || bombDir.indexOf("L") > -1 ){
                minX = ( bombDir.indexOf("R") > -1 ) ? X0 + 1 : minX;
                maxX = ( bombDir.indexOf("L")>-1 ) ? X0 - 1 : maxX;
                goX = minX + ((maxX - minX) / 2);
            }
            
            X0 = goX;
            Y0 = goY;
            
            System.out.println(goX + " " + goY);
        }
    }
}