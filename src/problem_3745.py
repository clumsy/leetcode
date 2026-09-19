class Solution:
    def maximizeExpressionOfThree(self, nums: List[int]) -> int:
        ma1, ma2, mi = -inf, -inf, inf
        for i in nums:
            mi = min(i, mi)
            if i > ma1:
                ma1, ma2 = i, ma1
            elif i > ma2:
                ma2 = i
        res = ma1 + ma2 - mi
        return res
