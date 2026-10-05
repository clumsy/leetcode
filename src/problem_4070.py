class Solution:
    def minRotations(self, s: str) -> int:
        res = cur = 0
        for d in s:
            c = ord(d) - ord("0")
            p = abs(cur - c)
            res += min(p, 10 - p)
            cur = c
        return res
