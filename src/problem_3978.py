class Solution:
    def isMiddleElementUnique(self, nums: list[int]) -> bool:
        res = sum(i == nums[len(nums) // 2] for i in nums) == 1
        return res
