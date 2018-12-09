package CTCI.Chapter_1_Arrays_And_Strings;

import java.util.HashMap;

public class Anagrams {
	
	// Write a method to decide if two strings are anagrams or not.
	// Anagram - a word, phrase, or name formed by rearranging the 
	// letters of another, such as cinema, formed from iceman.
	
	// solution 1 - sort the strings and compare them
	public static boolean anagram(String s, String t){
		return sort(s) == sort(t);
	}
	
	// sorts strings
	public static String sort(String s){
		return "";
	}
	
	// solution 2 - Check if the two strings have identical counts for
	//				each unique char
	public static boolean anagram2(String s, String t){
		
		// return false if the lengths are not the same
		if(s.length() != t.length()) return false;
		int[] letters = new int[256];
		int num_unique_chars = 0;
		int num_completed_t = 0;
		char[] s_array = s.toCharArray();
		for (char c : s_array){ // count number of each char in s
			if(letters[c] == 0){
				num_unique_chars++;
			}
			letters[c]++;
		}
		
		for(int i = 0; i < t.length(); i++){
			int c = (int) t.charAt(i);
			if(letters[c] == 0){ // Found more char c in t than in s
				return false;
			}
			
			letters[c]--;
			
			if(letters[c] == 0){
				num_completed_t++;
				if (num_completed_t == num_unique_chars){
					// it's a match if t has been processed completely
					return i == t.length() - 1;
				}
			}
		}
		return false;
	}
	
	// my solution - O(n) Time
	public static boolean anagram3(String s, String t){
		
		// if the strings contain the same num of chars
		// and chars types then they are anagrams
		
		char[] s_char = s.toCharArray();
		char[] t_char = t.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : s_char){
			int counter = 1;
			if(map.containsKey(c)){
				counter = map.get(c) + 1;
			}
			map.put(c, counter);
		}
		
		for(char c : t_char){
			int counter = -1;
			if(map.containsKey(c)){
				counter = map.get(c) - 1;
			}
			map.put(c, counter);
		}
		
		for(char c : map.keySet()){
			if(map.get(c) != 0){
				return false;
			}
		}
		
		return true;
		
	}
	
	public static void main(String[] args){
		System.out.println(anagram3("alldat", "tdaall"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
