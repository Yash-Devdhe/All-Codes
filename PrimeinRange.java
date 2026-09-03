import java.util.*;

class PrimeinRange {

    void printRange(int x) {

        boolean[] isPrime = new boolean[x + 1];

        // Assume every number is prime initially
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(x); i++) {

            if (isPrime[i]) {

                // Mark multiples of i as not prime
                for (int j = i * i; j <= x; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Print primes
        for (int i = 2; i < x; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        PrimeinRange p = new PrimeinRange();
        p.printRange(20);
    }
}