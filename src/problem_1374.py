class Solution:
    def generateTheString(self, n: int) -> str:
        res = "a" * n if n & 1 == 1 else "a" * (n - 1) + "b"
        return res
