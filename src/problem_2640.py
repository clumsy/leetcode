class Solution:
    def findPrefixScore(self, nums: List[int]) -> List[int]:
        n = len(nums)
        res, m = [0] * n, 0
        for i, e in enumerate(nums):
            m = max(m, e)
            res[i] = (res[i - 1] if i > 0 else 0) + nums[i] + m
        return res
