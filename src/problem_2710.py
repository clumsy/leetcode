class Solution:
    def removeTrailingZeros(self, num: str) -> str:
        res = num.rstrip("0")
        return res
