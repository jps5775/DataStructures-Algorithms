package CTCI.Chapter_1_Arrays_And_Strings;

public class SetMatrix0 {
	
	/**
	 * Write an algorithm such that if an element in an MxN matrix is 0,
	 * its entire row and column is set to 0.
	 */
	public static void setZeros(int[][] matrix){
		int[] row = new int[matrix.length];
		int[] col = new int[matrix[0].length];
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; i++){
				if(matrix[i][j] == 0){
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length; i++){
				if(row[i] == 1 || col[j] == 1){
					matrix[i][j] = 0;
				}
			}
		}
		
		
	}
	
}
