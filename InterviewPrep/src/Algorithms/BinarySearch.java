package Algorithms;

public class BinarySearch {
	
	// For a Binary Search the array must be sorted
	static int[] arrayToSearch = {1,22,43,63,86,99,100,204,306,308};
	
	public static void main(String[] args){
		long startTime = System.nanoTime();
		//linearSearch(arrayToSearch, 204); ~400,000 nanoseconds
		//binarySearch(arrayToSearch, 204); ~200,000 nanoseconds
		System.out.println("Estimated Time: " + (double)((System.nanoTime() - startTime)) + " nanoseconds");
	}
	
	/**
	 * Time Complexity: O(n) - linear time
	 */
	public static void linearSearch(int[] array, int elementToFind){
		for(int i = 0; i < array.length; i++){
			if(elementToFind == array[i]){
				System.out.println("Found element");
			}else{
				System.out.println(array[i]);
			}
		}
	}
	/**
	 * Time Complexity: O(log n) - better than linear time
	 */
	public static void binarySearch(int[] array, int elementToFind){
		int low = 0;
		int high = array.length-1;
		int mid;
		
		while(low <= high){
			mid = (high+low/2);
			if(elementToFind > array[mid]){
				low = mid + 1; // + 1 account for mid element already checked
			}else if(elementToFind < array[mid]){
				high = mid - 1; // - 1 account for mid element already checked
			}else{
				System.out.println("Found element: " + array[mid]);
				return;
			}
		}
		
	}
	
	
}
