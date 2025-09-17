class Solution:
    def maxAscendingSum(self, nums: List[int]) -> int:
        res, cur, n = 0, 0, len(nums)
        for i in range(n):
            cur = 0 if i > 0 and nums[i] <= nums[i - 1] else cur
            cur += nums[i]
            res = max(res, cur)
        return res
