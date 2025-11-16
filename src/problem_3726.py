class Solution:
    def removeZeros(self, n: int) -> int:
        res, d = 0, 1
        while n:
            n, r = divmod(n, 10)
            if r:
                res += r * d
                d *= 10
        return res
