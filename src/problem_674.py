class Solution:
    def findLengthOfLCIS(self, nums: List[int]) -> int:
        res, cur = 0, 0
        for i, e in enumerate(nums):
            if i and e <= nums[i - 1]:
                cur = 0
            cur += 1
            res = max(res, cur)
        return res
