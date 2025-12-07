class Solution:
    def maxAbsoluteSum(self, nums: List[int]) -> int:
        pos = neg = s = 0
        for i in nums:
            s += i
            pos = max(pos, s)
            neg = min(neg, s)
        res = pos - neg
        return res
