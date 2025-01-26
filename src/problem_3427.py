class Solution:
    def subarraySum(self, nums: List[int]) -> int:
        res, n = 0, len(nums)
        acc = list(accumulate(nums))
        for i, v in enumerate(nums):
            res += acc[i] - (acc[i - v - 1] if i - v > 0 else 0)
        return res
