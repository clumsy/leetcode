class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        ma2, ma1 = sorted(nums[:2])
        for i in nums[2:]:
            if i >= ma1:
                ma1, ma2 = i, ma1
            elif i >= ma2:
                ma2 = i
        res = (ma1 - 1) * (ma2 - 1)
        return res
