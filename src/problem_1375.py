class Solution:
    def numTimesAllBlue(self, flips: List[int]) -> int:
        res = ma = 0
        for i, e in enumerate(flips, 1):
            ma = max(ma, e)
            res += ma == i
        return res
