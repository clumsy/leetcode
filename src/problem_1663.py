class Solution:
    def getSmallestString(self, n: int, k: int) -> str:
        d, r = divmod(k - n, 25)
        res = ["a" if i < n - 1 - d else "z" for i in range(n)]
        if d < n:
            res[-d - 1] = chr(ord("a") + r)
        res = "".join(res)
        return res
