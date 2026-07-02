class Solution:
    def minOperations(self, nums: List[int]) -> int:
        res, n = 0, len(nums)
        for i in range(1, n):
            res += max(0, nums[i - 1] + 1 - nums[i])
            nums[i] = max(nums[i], nums[i - 1] + 1)
        return res
