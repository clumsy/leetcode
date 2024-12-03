class Solution:
    def alternateDigitSum(self, n: int) -> int:
        res = sum(int(d) * (1 - 2 * (i & 1)) for i, d in enumerate(str(n)))
        return res
