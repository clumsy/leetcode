class Solution:
    def sumBase(self, n: int, k: int) -> int:
        res = 0
        while n:
            n, r = divmod(n, k)
            res += r
        return res
