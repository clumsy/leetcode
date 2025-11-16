class Solution:
    def missingMultiple(self, nums: List[int], k: int) -> int:
        res, nums = k, set(nums)
        while res in nums:
            res += k
        return res
