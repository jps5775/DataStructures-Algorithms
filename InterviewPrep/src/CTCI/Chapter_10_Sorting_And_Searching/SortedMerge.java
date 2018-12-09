package CTCI.Chapter_10_Sorting_And_Searching;

public class SortedMerge {
	
	public void merge(int[] A, int[] B, int lenA, int lenB) {
		if(A.length == 0 || B.length == 0) { return; }
		if(A == null || B == null) { return; }
		int indexA = lenA - 1;
		int indexB = lenB - 1;
		int indexMerged = A.length - 1;
		
		while(indexB >= 0) {
			if(indexA >= 0 && A[indexA] > B[indexB]) {
				A[indexMerged] = A[indexA];
				indexA--;
			}else {
				A[indexMerged] = B[indexB];
				indexB--;
			}
			indexMerged--;
		}
	}
	
	public static void main(String[] args) {
		
	}
	
}
