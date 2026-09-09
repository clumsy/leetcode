class Solution:
    def largestEven(self, s: str) -> str:
        res = s[: s.rfind("2") + 1]
        return res
