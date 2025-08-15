class Solution:
    def maximumMedianSum(self, nums: List[int]) -> int:
        nums.sort()
        n = len(nums) // 3
        res = sum(nums[n::2])
        return res
