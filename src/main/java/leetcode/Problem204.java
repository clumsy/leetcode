package leetcode;

@BeatsPercent(74.16)
@Algorithms(Algorithm.SIEVE_OF_ERATOSTHENES)
@TimeComplexity(Complexity.SQRT_N)
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem204 {
    public int countPrimes(int n) {
        if (n < 3) {
            return 0;
        }
        boolean[] not_prime = new boolean[n];
        int count = n/2; // even numbers >3 are NOT prime
        for (int i = 3; i*i < n; i += 2) { // iterating odd numbers with squares below n
            if (!not_prime[i]) {
                for (int j = i*i; j < n; j += 2*i) { // increments to keep the numbers odd
                    if (!not_prime[j]) {
                        not_prime[j] = true;
                        count--;
                    }
                }
            }
        }
        return count;
    }
}
