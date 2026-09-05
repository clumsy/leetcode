class Solution:
    def minimumPrefixLength(self, nums: List[int]) -> int:
        res = 0
        for i in reversed(range(len(nums) - 1)):
            if nums[i] >= nums[i + 1]:
                res = i + 1
                break
        return res
