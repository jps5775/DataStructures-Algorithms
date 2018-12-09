package Algorithms;

public class CountPrimesToN {


    public static int countPrimes(int n){

        if(n < 2){
            return 0;
        }

        int primes = 0;
        boolean[] sieve = new boolean[n];
        setValuesTrue(sieve);

        for (int i = 2; i < n; i++) {

            if(i*i < n){
                if(sieve[i]){
                    setFactorsFalse(sieve, i);
                    primes++;
                }
            }else{
                if(sieve[i]){
                    primes++;
                }
            }
        }
        return primes;
    }

    public static void setFactorsFalse(boolean[] sieve, int n){
        for (int i = n*n; i < sieve.length; i = i + n) {
            sieve[i] = false;
        }
    }

    public static void setValuesTrue(boolean[] sieve){
        for (int i = 0; i < sieve.length; i++) {
            sieve[i] = true;
        }
    }



    public static void main(String[] args) {
        System.out.println(countPrimes(7));
    }
}
