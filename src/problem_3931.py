class Solution:
    def isAdjacentDiffAtMostTwo(self, s: str) -> bool:
        res = max(abs(int(f) - int(b)) for f, b in zip(s, s[1:])) <= 2
        return res
