class Solution:
    def countPrimeSetBits(self, left: int, right: int) -> int:
        primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43}
        res = sum(bin(i)[2:].count("1") in primes for i in range(left, right + 1))
        return res
