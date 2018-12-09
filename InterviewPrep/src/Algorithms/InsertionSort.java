package Algorithms;

import java.util.Arrays;

public class InsertionSort {
	static int[] array = {6,4,7,3,8,9,0};
	
	public static void main(String[] args){
		System.out.println(Arrays.toString(array));
		System.out.println();
		insertionSort(array);
		System.out.println(Arrays.toString(array));
	}
	
	//O(n^2)
	public static void insertionSort(int[] array){
		
		for(int i = 1; i < array.length; i++){
			int hold = array[i];
			int j = i;
			while(j > 0 && hold < array[j-1]){
				//swap
				array[j] = array[j-1];
				j--;
			}
			array[j] = hold;
		}
	}
}
