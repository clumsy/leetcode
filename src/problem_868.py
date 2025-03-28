class Solution:
    def binaryGap(self, n: int) -> int:
        res = 0
        # small enough not to exhaust until we see the first 1
        cur = -32
        while n:
            n, r = divmod(n, 2)
            if r == 1:
                res = max(res, cur)
                cur = 0
            cur += 1
        return res
