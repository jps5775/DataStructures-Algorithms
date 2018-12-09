package Algorithms;

import java.util.Arrays;

public class BubbleSort {
	static int[] array = {7,47,96,3,6,78,45,2,5,99};
	
	public static void main(String[] args){
		System.out.println(Arrays.toString(array));
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}
	/**
	 * O(n^2)
	 * 
	 * Loop through array length of the array starting from the end and check
	 * and swap values while going through the array forward with another
	 * loop
	 */
	public static void bubbleSort(int[] array){
		for(int i = array.length - 1; i > 0; i--){
			for(int j = 0; j < i; j++){
				if(array[j] > array[j+1]){
					//swap
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
}
