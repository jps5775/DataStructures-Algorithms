package CTCI.Chapter_1_Arrays_And_Strings;

public class ReplaceW20 {

	/**
	 * Write a method to replace all spaces in a string with ‘%20’.
	 */
	public static void replaceSpaces(char[] str, int length){
		
		int spaces = 0;
		int newlength, i = 0;
		for(i = 0; i < length; i++){
			if(str[i] == ' '){
				spaces++;
			}
		}
		
		newlength = length + spaces * 2;
		str[newlength] = '\0';
		for(i = length - 1; i >= 0; i--){
			if(str[i] == ' '){
				str[newlength - 1] = '0';
				str[newlength - 2] = '2';
				str[newlength - 3] = '%';
				newlength = newlength - 3;
			}else{
				str[newlength - 1] = str[i];
				newlength = newlength - 1;
			}
		}
		
	}
} 
