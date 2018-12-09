package CTCI.Chapter_1_Arrays_And_Strings;


/**
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you can not use additional data structures?
 */

public class UniqueChars {
	public static void main(String[] args){
		System.out.println(isUniqueChars2("string"));
	}
	
	/**
	 * Time Complexity: O(n), where n is the length of the string
	 * Space Complexity: O(n)
	 * 
	 * 
	 */
	public static boolean isUniqueChars2(String str){
		// used to keep track of the chars in string
		boolean[] char_set = new boolean[256];
		// go through the string
		for(int i = 0; i < str.length(); i++){
			// gets the ascii char number
			int val = str.charAt(i);
			// if the char is true set return false
			// because there is a duplicate
			if(char_set[val]){
				return false;
			}
			// else set that char to true
			char_set[val] = true;
		}
		
		return true;
	}
	
	/**
	 * TimeComplexity: O(n)
	 * Space Complexity: O(n)
	 * 		We can reduce space usage a little by using a bit vector.
	 * 		We assume the string is only lower case 'a' through 'z'.
	 * 
	 */
	public static boolean isUniqueChars(String str){
		int checker = 0;
		// ++i - means that i is incremented before any operation
		// i++ - means that i is incremented after all operations
		for(int i = 0; i < str.length(); ++i){
			// get the char int for char - 'a' 
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0){
				return false;
			}
			checker |= (1 << val);
		}
		return false;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}














