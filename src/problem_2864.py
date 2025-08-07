class Solution:
    def maximumOddBinaryNumber(self, s: str) -> str:
        n, ones = len(s), s.count("1")
        res = "1" * (ones - 1) + "0" * (n - ones) + "1"
        return res
