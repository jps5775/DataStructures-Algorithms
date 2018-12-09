package CTCI.Chapter_8_Recursion_And_DP;

public class RecursiveMultiply {

    // bitwise mult by 2
    // n << 1

    // bitwise divide by 2
    // n >> 1

    // time: O(b), b is the number we are multiplying by
    // space: O(b), ""
    public static int mult(int a, int b){
        if(a == 0 || b == 0){return 0;}
        else if(a == 1){return b;}
        else if(b == 1){return a;}
        else{
            int sum = mult(a, b - 1) + a;
            return sum;
        }
    }

    public static void main(String[] args){
        System.out.println(mult(4,5));
    }

}
