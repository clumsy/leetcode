class Solution:
    def reverseDegree(self, s: str) -> int:
        res = sum((i + 1) * (26 - (ord(c) - ord("a"))) for i, c in enumerate(s))
        return res
