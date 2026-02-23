class Solution:
    def isDigitorialPermutation(self, n: int) -> bool:
        cnt = Counter(str(n))
        sum = 0
        while n:
            n, r = divmod(n, 10)
            sum += factorial(r)
        res = Counter(str(sum)) == cnt
        return res
