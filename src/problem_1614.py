class Solution:
    def maxDepth(self, s: str) -> int:
        res = cur = 0
        for c in s:
            cur += 1 if c == "(" else -1 if c == ")" else 0
            res = max(res, cur)
        return res
