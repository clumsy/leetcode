class Solution:
    def maxValidPairSum(self, nums: list[int], k: int) -> int:
        pfx = res = 0
        for i in range(len(nums) - k):
            pfx = max(pfx, nums[i])
            res = max(res, pfx + nums[i + k])
        return res
