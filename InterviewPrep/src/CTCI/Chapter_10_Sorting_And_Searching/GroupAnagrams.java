package CTCI.Chapter_10_Sorting_And_Searching;

import java.util.Arrays;
import java.util.Comparator;

public class GroupAnagrams {
	public static void main(String[] args) {
		String[] array = {"eat", "tea", "tan", "ate", "nat", "bat"};
		Arrays.sort(array, new AnagramComparator());
		System.out.println(array);
	}
}

class AnagramComparator implements Comparator<String>{
	private String sortChars(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}

	@Override
	public int compare(String o1, String o2) {
		return sortChars(o1).compareTo(o2);
	}
}
