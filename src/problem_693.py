class Solution:
    def hasAlternatingBits(self, n: int) -> bool:
        res, i = True, n & 1
        while n:
            n, r = divmod(n, 2)
            if r & 1 != i & 1:
                res = False
                break
            i += 1
        return res
