package Algorithms;

public class QuickSort {

    public static void quicksort(int[] arr, int left, int right){
    		
    		int prevLeft = partition(arr, left, right);
    		if(left < prevLeft - 1) {
    			quicksort(arr, left, prevLeft - 1);
    		}
    		if(prevLeft < right) {
    			quicksort(arr, prevLeft, right);
    		}
    }

    public static int partition(int[] arr, int left, int right){
    		int pivot = arr[(left + right)/2];
    		
    		while(left <= right) {
	    		while(arr[left] < pivot) {
	    			left++;
	    		}
	    		
	    		while(arr[right] > pivot) {
	    			right--;
	    		}
	    		
	    		
	    		if(left <= right) {
	    			//swap
	    			int temp = arr[left];
	    			arr[left] = arr[right];
	    			arr[right] = temp;
	    			
	    			left++;
	    			right--;
	    		}
    		}
    		return left;
    }
    
    public static void printArray(int[] arr) {
    		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
    }

    public static void main(String[] args) {
		int[] arr = {8,2,9,4,3,7,5,6,1};
		quicksort(arr, 0, arr.length-1);
		printArray(arr);
	}


}
