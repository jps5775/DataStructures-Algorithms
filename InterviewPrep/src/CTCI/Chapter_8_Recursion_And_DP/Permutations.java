package CTCI.Chapter_8_Recursion_And_DP;

import java.util.ArrayList;

public class Permutations {

    public static ArrayList<String> getPerms(String str){
        ArrayList<String> result = new ArrayList<>();
        getPerms("", str, result);
        return result;
    }

    public static void getPerms(String prefix, String remaining, ArrayList<String> result){

        if(remaining.length() == 0){
            result.add(prefix);
        }

        for(int i = 0; i < remaining.length(); i++){
            String before = remaining.substring(0, i);
            String after = remaining.substring(i + 1, remaining.length());
            char c = remaining.charAt(i);
            getPerms(prefix + c, before + after, result);
        }


    }
    
    
    
    // my version
    
    ArrayList<String> perm(String str){
    		return perm(0, str.length(), str, new ArrayList<String>());
    }
    
    ArrayList<String> insert(int toInsert, ArrayList<String> allPermsList){
    		for(int i = 0; i < allPermsList.size(); i++) {
    			for (int j = 0; j < allPermsList.get(i).length(); j++) {
				// insert into spot then add to list
			}
    		}
    		
    		return allPermsList;
    }
    
    ArrayList<String> perm(int start, int end, String str, 
    			ArrayList<String> allPermsList){
		if(start == end) {
			allPermsList.add(Character.toString(str.charAt(end)));
			return allPermsList;
		}else {
			return insert(end, perm(start, end - 1, str, allPermsList));
		}
    }

    public static void main(String[] args) {
        ArrayList<String> result = getPerms("aabc");

        for(String s : result){
            System.out.println(s);
        }

    }

}
