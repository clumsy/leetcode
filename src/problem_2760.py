class Solution:
    def longestAlternatingSubarray(self, nums: List[int], threshold: int) -> int:
        res = cur = 0
        for i, e in enumerate(nums):
            if cur == 0 or e > threshold or (cur > 0 and nums[i - 1] & 1 == nums[i] & 1):
                cur = int(e <= threshold and e & 1 == 0)
            else:
                cur += 1
            res = max(res, cur)
        return res
