class Solution:
    def sumOfGoodNumbers(self, nums: List[int], k: int) -> int:
        res = 0
        for i, e in enumerate(nums):
            if nums[i] > (nums[i - k] if i >= k else 0) and nums[i] > (nums[i + k] if i + k < len(nums) else 0):
                res += e
        return res
