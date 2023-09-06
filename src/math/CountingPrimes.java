package math;

public class CountingPrimes {

    // Solution: https://thedailybyte.dev/solution/84?token=98170951f31a309c7389248bc34f7831e8622e38527cb03354d665b00ae058a0
    // Runtime: O(N * loglog(N)) where N is the number we’re given.
    // Space complexity: O(N) where N is the number we’re given. This results from our primes boolean array
    public int countPrimesLessThanN(int n) {
        boolean[] primes = new boolean[n];
        for(int i = 0; i < primes.length; i++) {
            primes[i] = true;
        }

        for(int i = 2; i < Math.sqrt(n); i++) {
            if(primes[i]) {
                for(int j = i; j * i < primes.length; j++) {
                    primes[i * j] = false;
                }
            }
        }

        int primeCount = 0;
        for(int i = 2; i < primes.length; i++) {
            if(primes[i]) {
                primeCount++;
            }
        }

        return primeCount;
    }
}
