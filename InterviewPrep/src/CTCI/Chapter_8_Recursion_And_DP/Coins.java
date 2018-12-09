package CTCI.Chapter_8_Recursion_And_DP;

public class Coins {


    public static int coins(int n){
        return coins(n, 0, 0, 0, 0, 0, 0);
    }

    public static int coins(int n, int pennies, int nickels, int dimes, int quarters, int total,
                        int ways){
        if(total == n){
            return 1;
        }else if(total > n){
            return 0;
        }

        ways = coins(n, pennies + 1, nickels, dimes, quarters, total+1, ways) +
                coins(n, pennies, nickels + 1, dimes, quarters, total+5, ways) +
                coins(n, pennies, nickels, dimes + 1, quarters, total+10, ways) +
                coins(n, pennies, nickels, dimes, quarters + 1, total+25, ways);

        return ways;
    }


    public static void main(String[] args) {
        System.out.println(coins(7));
    }
}
