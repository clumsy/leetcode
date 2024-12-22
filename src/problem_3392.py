class Solution:
    def countSubarrays(self, nums: List[int]) -> int:
        res = sum(2 * (nums[i - 2] + nums[i]) == nums[i - 1] for i in range(2, len(nums)))
        return res
