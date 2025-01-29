class Solution:
    def maxAdjacentDistance(self, nums: List[int]) -> int:
        res = max(abs(nums[i - 1] - nums[i]) for i in range(-1, len(nums)))
        return res
