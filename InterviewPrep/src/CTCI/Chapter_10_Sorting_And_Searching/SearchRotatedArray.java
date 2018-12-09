package CTCI.Chapter_10_Sorting_And_Searching;

public class SearchRotatedArray {
	
	public static int searchRotatedArray(int[] arr ,int x) {
		int pivotPoint = findPivot(arr);
		
		if(arr[pivotPoint] == x) {
			return pivotPoint;
		}else if(arr[pivotPoint] <= x && arr[arr.length - 1] <= x) {
			// search right
			return searchRotatedArray(pivotPoint, arr.length - 1, arr, x);
		}else {
			return searchRotatedArray(0, pivotPoint - 1, arr , x);
		}
	}
	
	public static int searchRotatedArray(int left, int right, int[] arr, int x) {
		int mid = (left + right) / 2;
		if(left <= right) {
			if(arr[mid] == x) {
				return mid;
			}else if(arr[mid] < x) {
				return searchRotatedArray(mid+1, right, arr, x);
			}else {
				return searchRotatedArray(left, mid-1, arr, x);
			}
		}
		return -1;
	}
	
	public static int findPivot(int[] arr) {
		return 0;
	}
	
	public static void main(String[] args) {
		
	}
}
