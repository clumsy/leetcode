class Solution:
    def numPrimeArrangements(self, n: int) -> int:
        MOD = int(1e9 + 7)
        is_prime = [True] * (n + 1)
        is_prime[0] = is_prime[1] = False
        for i in range(2, n + 1):
            for j in range(i + 1):
                if i * j > n:
                    break
                if is_prime[j]:
                    is_prime[i * j] = False

        def fac(k):
            res = 1
            for i in range(1, k + 1):
                res = (res * i) % MOD
            return res

        num_primes = sum(is_prime)
        res = (fac(num_primes) * fac(n - num_primes)) % MOD
        return res
