package CTCI.Chapter_1_Arrays_And_Strings;

public class Rotations {
	/**
	 * Assume you have a method isSubstring which checks if one word is 
	 * a substring of another. Given two strings, s1 and s2, write code
	 * to check if s2 is a rotation of s1 using only one call to
	 * isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).
	 */
	
	public static boolean isRotation(String s1, String s2){
		
		if(s1.length() == s2.length() && s1.length() > 0){
			// double the word and check if it is a substring
			String s1Doubled = s1 + s1;
			isSubstring(s1Doubled, s2);
		}
		
		return false;
	}

	public static void isSubstring(String s1Doubled, String s2) {
		// checks if one word is a substring of another
	}
}
