class Solution:
    def countOdds(self, low: int, high: int) -> int:
        res = (high + 1) // 2 - low // 2
        return res
