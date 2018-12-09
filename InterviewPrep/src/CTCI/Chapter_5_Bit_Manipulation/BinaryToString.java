package CTCI.Chapter_5_Bit_Manipulation;

public class BinaryToString {
	
	public static String printBinary(double num) {
		if(num <= 0 || num >= 1){
			return "ERROR";
		}
		StringBuilder binary = new StringBuilder();
		binary.append(".");
		
		int remainder = 0;
		for(int i = 0; i < 32; i++) {
			num = num * 2;
			if(num >= 1) {
				remainder = 1;
				num = num - 1;
			}
			else {remainder = 0;}
			
			binary.append(remainder);
		}
		
		
		return binary.toString();
	}
	
	
	public static void main(String[] args) {
		System.out.println(printBinary(.101));
	}
	
	
}
