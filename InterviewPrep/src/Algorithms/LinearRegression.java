package Algorithms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LinearRegression {

	public static void main(String[] args) throws IOException{
		// get matrix of data
		String[][] dataSet = readFile();
		
		// Testing matrix
		//printMatrix(dataSet);
		
		// define learning rate
		double alpha = 0.0001;
		// number of iterations of gradient descent
		int m = 1000;
		// initial theta_0 and theta_1 which would produce a flat line along x axis
		double[] initialThetaVector = new double[2];
		initialThetaVector[0] = 0.0;
		initialThetaVector[1] = 0.0;
		
		// Before both optimal thetas are found 
		System.out.println("Starting gradient descent at theta_0 = " + initialThetaVector[0] +", theta_1 = "+ initialThetaVector[1] +", error = "+ computeSumSquaredErrorForline(initialThetaVector[0], initialThetaVector[1], dataSet));
		// use gradient descent to find best thetas
		initialThetaVector = gradientDescentRunner(dataSet, initialThetaVector, alpha, m); //TODO: issue here
		
		// After both optimal thetas are found
		System.out.println("After " + m + " iterations theta_0 = "+ initialThetaVector[0] +", theta_1 = "+ initialThetaVector[1] +", error = "+ computeSumSquaredErrorForline(initialThetaVector[0], initialThetaVector[1], dataSet));
		
		// hypothesis equation - line that best fits the data
		System.out.println("Best Fit Line is: h_theta(x) = " + Double.toString(initialThetaVector[0]) + " + " + Double.toString(initialThetaVector[1]) + " * x");
		
	}
	
	/**
	 * 
	 * Performs Gradient Descent
	 * 
	 * @param m 				The number of iterations
	 * @param alpha 			The learning rate
	 * @param thetaVector 	The vector containing the starting theta vector
	 * @param dataSet 		The training data set
	 * @return 				The vector of best theta values
	 */
	public static double[] gradientDescentRunner(String[][] dataSet, double[] startingThetaVector, double alpha, int m){
		
		double[] optimalThetaVector = new double[2];
		optimalThetaVector[0] = startingThetaVector[0]; 
		optimalThetaVector[1] = startingThetaVector[1];
		
		// this is repeat until convergence step
		for(int i = 0; i < m; i++){
			// this is performing gradient descent for each theta in data set
			// performs step gradient then assigns updates the theta values
			optimalThetaVector = stepGradient(optimalThetaVector[0], optimalThetaVector[1], dataSet, alpha);
		}
		
		
		return optimalThetaVector;
	
	}
	
	/**
	 * 
	 * This is the gradient descent equation at a certain Theta_0 and Theta_1
	 * 
	 * @param currentTheta_0
	 * @param currentTheta_1
	 * @param dataSet
	 * @param alpha
	 */
	public static double[] stepGradient(double currentTheta_0, double currentTheta_1, String[][] dataSet, double alpha){
		double[] thetaGradients = new double[2];
		thetaGradients[0] = 0.0;
		thetaGradients[1] = 0.0;
		double m = (double)dataSet.length;
		for(int i = 0; i < dataSet.length; i++){
			double x = Double.parseDouble(dataSet[i][0]);
			double y = Double.parseDouble(dataSet[i][1]);
			double y_hat = (currentTheta_1 * x) + currentTheta_0; 
			thetaGradients[0] += -(2/m) * (y - (y_hat));
			thetaGradients[1] += -(2/m) * x * (y - (y_hat));
		}
		
		double newTheta_0 = currentTheta_0 - (alpha * thetaGradients[0]);
		double newTheta_1 = currentTheta_1 - (alpha * thetaGradients[1]);

		return new double[]{newTheta_0, newTheta_1};
		
	}

	/**
	 * 
	 * Takes a current best fit line defined by theta_0 and theta_1 and outputs the totalError
	 * 
	 * @param theta_0 	The current theta_0
	 * @param theta_1	The current theta_1
	 * @param dataSet	The training data set
	 * @return			the total average of the sum of the squared error 
	 */
	public static double computeSumSquaredErrorForline(double theta_0, double theta_1, String[][] dataSet){
		double totalError = 0;
		for(int i = 0; i < dataSet.length; i++){
			double x = Double.parseDouble(dataSet[i][0]);
			double y = Double.parseDouble(dataSet[i][1]);
			double y_hat = theta_1 * x + theta_0;
			totalError += Math.pow((y - y_hat),2);
		}
		return totalError / (double)dataSet.length;
	}
		

	public static void printMatrix(String[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static String[][] readFile() throws IOException{
		String filePath = "/Users/JoeSema/Documents/Computer Science/Machine Learning/Data/dataSet.csv";
		BufferedReader fileBufferedReader = new BufferedReader(new FileReader(filePath));
		String line;
		
		//get total size of data
		BufferedReader fileBufferedReader2 = new BufferedReader(new FileReader(filePath));
		int j = 0;
		while((fileBufferedReader2.readLine()) != null){
			j++;
		}
		fileBufferedReader2.close();
		
		String[][] dataSet = new String[j][2];
		
		// now parse data into matrix
		/**
		 * 				x	 y
		 * 			[ [ 64,  89 ],
		 * 			  [ 77,  80 ],
		 * 			  [ 65,  22 ] ]
		 * 
		 * 		where data[0][1] = 89
		 * 		      data[2][0] = 65 
		 */
		
		int i = 0;
		while((line = fileBufferedReader.readLine()) != null){
			// parses line into array ["34","44"]
			dataSet[i] = line.split(",");
			i++;
		}
		
		// fixes parsing issues where there is an extra character in beginning of x values
		dataSet[0][0] = dataSet[0][0].substring(1, dataSet[0][0].length());
		
		fileBufferedReader.close();
		
		return dataSet;
	}
	
	
}
