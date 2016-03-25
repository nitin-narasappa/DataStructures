import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
* Print a staircase.
*       #
*      ##
*     ###
*    ####
*   #####
*  ######
*/
public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuffer buff = new StringBuffer(n);
        for (int i=1; i <= n; i++){
             for (int j=1; j <= n; j++){
                 // Fill space until n-i length
                 if( j <= n-i) {
                    System.out.print(" ");
                  } else {
                     // Fill # for the rest.
                     System.out.print("#");
                 }
             }
            System.out.println("");
        }
    }
}
