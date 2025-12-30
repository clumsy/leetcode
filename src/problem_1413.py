class Solution:
    def minStartValue(self, nums: List[int]) -> int:
        mi = s = nums[0]
        for i in range(1, len(nums)):
            s += nums[i]
            mi = min(mi, s)
        res = max(1, 1 - mi)
        return res
