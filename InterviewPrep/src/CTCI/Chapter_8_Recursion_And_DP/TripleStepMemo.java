package CTCI.Chapter_8_Recursion_And_DP;

public class TripleStepMemo {

    public static int step(int n){
        if(n == 0){return 0;}
        return step(n, 0, new int[n+1]);
    }

    public static int step(int n, int currLen, int[] memo){
        if(currLen == n){return 1;}
        else if(currLen > n){return 0;}
        else{
            if(memo[currLen] == 0) {
                memo[currLen] = step(n, currLen + 1, memo)
                        + step(n, currLen + 2, memo)
                        + step(n, currLen + 3, memo);
            }
            return memo[currLen];
        }
    }

    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        System.out.println(step(30));
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

}
