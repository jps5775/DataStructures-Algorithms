package CTCI.Chapter_8_Recursion_And_DP;

public class TripleStep {

    public static int step(int n){
        if(n == 0){return 0;}
        return step(n, 0);
    }

    public static int step(int n, int currLen){
        if(currLen == n){return 1;}
        else if(currLen > n){return 0;}
        else{
            return step(n, currLen + 1) + step(n, currLen + 2)
                    + step(n, currLen + 3);
        }
    }

    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        System.out.println(step(30));
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

}
