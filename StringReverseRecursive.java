import java.util.Scanner;
/**
* String reversing using recursive method call
*/
public class StringReverseRecursive {
  
	private StringBuffer reversedSB = new StringBuffer();

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String original = "Java2String";//reader.nextLine();
		StringReverseRecursive srr = new StringReverseRecursive();
		srr.reverseRecursive(original);
		
		System.out.println(original);
		System.out.println(srr.reversedSB.toString());
	}
	
	private void reverseRecursive(String str) {
		if (str.length() == 1) {
			reversedSB.append(str);
		}
		else {
			reversedSB.append(str.charAt(str.length() -1));
			reverseRecursive(str.substring(0, str.length() - 1));	
		}
	}
}
