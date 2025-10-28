class Solution:
    def maxRepeating(self, s: str, w: str) -> int:
        res, cur, i, lw, ls = 0, 0, 0, len(w), len(s)
        while i < ls:
            if s[i : min(ls, i + lw)] == w:
                i += lw
                cur += 1
            else:
                i += 1 - (lw if cur else 0)
                cur = 0
            res = max(res, cur)
        return res
