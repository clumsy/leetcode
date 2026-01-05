class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        res = prev = cur = 0
        for i, e in enumerate(nums):
            if e == 0:
                prev = 0 if i > 0 and nums[i - 1] == 0 else cur
                cur = 0
            else:
                cur += 1
            res = max(res, prev + cur)
        res -= res == len(nums)
        return res
