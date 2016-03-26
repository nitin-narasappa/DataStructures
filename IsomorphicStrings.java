import java.util.*;
/**
* Two strings are isomorphic if the characters in s can be replaced to get t.
* For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.
*/
public class IsomorphicStrings {
	public static void main(String[] args) {
		String first = "foo";
		String second = "bar";
		new IsomorphicStrings().isIsomorphic(first, second);
	}
	
	private void isIsomorphic(String first, String second){
		boolean isIsomorphic = true;
		Map<Character, Character> checker = new HashMap<Character, Character>();
		if(first.length() == second.length()) {
			for (int i = 0; i < first.length(); i++) {
				if(checker.containsKey(first.charAt(i))){
					if(!checker.get(first.charAt(i)).equals(second.charAt(i))){
						isIsomorphic = false;
						break;
					}
				}
				else{
					checker.put(new Character(first.charAt(i)), new Character(second.charAt(i)));
				}
			}
		}
		else {
			isIsomorphic = false;
		}
		
		System.out.println(isIsomorphic);
	}
	
}
