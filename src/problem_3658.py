class Solution:
    def gcdOfOddEvenSums(self, n: int) -> int:
        res = gcd(n * n, n * (n + 1))
        return res
