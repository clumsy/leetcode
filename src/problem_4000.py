class Solution:
    def largestInteger(self, n: int, s: int) -> int:
        if s > n * 9:
            res = -1
        else:
            res = 0
            while s or n:
                d = min(s, 9)
                s -= d
                n -= 1
                res = res * 10 + d
        return res
