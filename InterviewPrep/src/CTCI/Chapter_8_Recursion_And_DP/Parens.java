package CTCI.Chapter_8_Recursion_And_DP;

public class Parens {


    public static void parens(int n){
        parens(n, 0, 0, "");
    }


    // time: O(2^n)
    // space: O(n)
    public static void parens(int n, int open, int close, String result){

        if(open == n && close == n){
            System.out.println(result);
        }else{
            if(open < n){
                parens(n, open + 1, close, result + "(");
            }

            if(close < open){
                parens(n, open, close + 1, result + ")");
            }
        }

    }


    public static void main(String[] args) {
        parens(3);
    }

}
