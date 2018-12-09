package CTCI.Chapter_1_Arrays_And_Strings;

public class RemoveDuplicateChars {
	/**
	 * Design an algorithm and write code to remove the duplicate characters in a 
	 * string without using any additional buffer. 
	 * NOTE: One or two additional variables are fine. 
	 * An extra copy of the array is not.
	 */
	
	public static void main(String[] args){
		char[] c = {'a','v','c', 'a', 'c'};
		removeDuplicates2(c);
	}
	
	/**
	 * Time: O(n^2)
	 */
	// function takes a char array as input.
	// modifies it to remove duplicates and adds a 0 to mark the end
	// of the unique chars in the array.
	public static void removeDuplicates(char[] str) {
	  if (str == null) return; // if the array does not exist..nothing to do return.
	  int len = str.length; // get the array length.
	  if (len < 2) return; // if its less than 2..can't have duplicates..return.
	  int tail = 1; // number of unique char in the array.
	  // start at 2nd char and go till the end of the array.
	  for (int i = 1; i < len; ++i) { 
	    int j;
	    // for every char in outer loop check if that char is already seen.
	    // char in [0,tail) are all unique.
	    for (j = 0; j < tail; ++j) {
	      if (str[i] == str[j]) break; // break if we find duplicate.
	    }
	    // if j reachs tail..we did not break, which implies this char at pos i
	    // is not a duplicate. So we need to add it our "unique char list"
	    // we add it to the end, that is at pos tail.
	    if (j == tail) {
	      str[tail] = str[i]; // add
	      ++tail; // increment tail...[0,tail) is still "unique char list"
	    }
	  }
	  str[tail] = 0; // add a 0 at the end to mark the end of the unique char.
	}
	
	public static void removeDuplicates2(char[] str){
		
		for(int i = str.length-1; i > 0; i--){
			for(int j = 0; j < i; j++){
				if(str[j] > str[j+1]){
					// swap
					int temp = str[j];
					str[j] = str[j+1];
					str[j+1] = (char) temp;
				}
			}
			
		}
		System.out.println(str);
		
		// string is sorted from 
		// check chars next to eachother
		for(int i = 0; i < str.length-1; i++){
			if(str[i] == str[i+1]){
				str[i] = '0';
			}
		}
		
		System.out.println(str);
		
	}
	
}
