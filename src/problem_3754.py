class Solution:
    def sumAndMultiply(self, n: int) -> int:
        n = "".join(c for c in str(n) if c != "0")
        res = int(n) * sum(int(c) for c in n) if n else 0
        return res
