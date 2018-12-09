package CTCI.Chapter_5_Bit_Manipulation;

public class Insertion {
	
	public static int insertion(int N, int M, int i, int j) {
		// clear bits from j to i
		int clearingMask;
		
		int allOnes = ~(0);
		
		int leftMask = allOnes << j + 1;
		int rightMask = (allOnes << i) - 1;
		
		clearingMask = leftMask | rightMask;
		
		N = N & clearingMask;
		
		// set bits from j to i
		M = M << i;
		
		N = N | M;
		
		return N;
	}
	
	public static void main(String[] args) {
		int N = 0b10000000000;
		int M = 0b10011;
		int i = 2;
		int j = 6;
		System.out.println(Integer.toBinaryString(insertion(N, M, i, j)));
		
	}
}
