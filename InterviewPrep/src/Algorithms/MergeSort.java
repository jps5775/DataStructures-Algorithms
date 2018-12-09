package Algorithms;

public class MergeSort {
	
	public static void mergesort(int[] arr) {
		mergesort(arr, new int[arr.length], 0, arr.length - 1);
	}
	
	public static void mergesort(int[] arr, int[] temp, int start, int end) {
		if(start >= end) {
			return;
		}
		int mid = (start+end)/2;
		mergesort(arr, temp, start, mid);
		mergesort(arr, temp, mid+1, end);
		mergeHalves(arr, temp, start, end);
	}
	
	public static void mergeHalves(int[] arr, int[] temp, int leftStart, int rightEnd) {
		int leftEnd = (rightEnd + leftStart) / 2;
		int rightStart = leftEnd + 1;
		int size = rightEnd - leftStart + 1;
		
		int left = leftStart;
		int right = rightStart;
		int index = leftStart;
		
		while(left <= leftEnd && right <= rightEnd) {
			if(arr[left] <= arr[right]) {
				temp[index] = arr[left];
				left++;
			}else{
				temp[index] = arr[right];
				right++;
			}
			index++;
		}
		
		System.arraycopy(arr, left, temp, index, leftEnd - left + 1);
		System.arraycopy(arr, right, temp, index, rightEnd - right + 1);
		System.arraycopy(temp, leftStart, arr, leftStart, size);
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {8,2,9,4,3,7,5,6,1};
		mergesort(arr);
		printArray(arr);
	}
}
