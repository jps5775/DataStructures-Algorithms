package CTCI.Chapter_8_Recursion_And_DP;

public class TowersOfHanoi {

    // time: O(2^n)
    // space: O(n)
    public static void towersOfHanoi(int n, char source, char dest, char aux){

        if(n == 0){
            return;
        }

        towersOfHanoi(n - 1, source, aux, dest);
        System.out.println("Moving " + n + " from " + source + " to " + dest);
        towersOfHanoi(n - 1, aux, dest, source);
    }

    public static void main(String[] args) {
        towersOfHanoi(64, 'A', 'C', 'B');
    }


}
