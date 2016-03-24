import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
* Input: The first line contains an integer TT, i.e. the number of test cases. 
*    The next TT lines contain a string each.
* Output:For each test case, print the minimum number of deletions required to make the characters alternating.
* Ex: AAABBB ⟹⟹ AB, 4 deletions because to convert it to AB we need to delete 2 A's and 2 B's
*/
public class AlternatingCharacters {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner reader = new Scanner(System.in);
        int testcases = Integer.parseInt(reader.nextLine());
        for (int i=0; i<testcases; i++) {
            String input = reader.nextLine();
            int counter =0;
            if(input.length() <= 1){
                System.out.println(counter);
                continue;
            }
            for (int j=1; j < input.length(); j++) {
                if(input.charAt(j-1) == input.charAt(j)){
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}
