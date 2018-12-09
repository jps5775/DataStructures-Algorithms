package Algorithms;

import java.util.Arrays;

public class SelectionSort {
	static int[] array = {7,47,96,3,6,78,45,2,5,99};
	
	public static void main(String[] args){
		System.out.println(Arrays.toString(array));
		System.out.println();
		selectionSort(array);
		System.out.println(Arrays.toString(array));
	}
	
	
	public static void selectionSort(int[] array){
		for(int i = 0; i < array.length; i++){
			int min = i;
			for(int j = i; j < array.length; j++){
				if(array[min] > array[j]){
					min = j;
				}
			}
			//swap
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
			
		}
	}
}
