class Solution:
    def minOperations(self, nums: List[int]) -> int:
        res = 0 if min(nums) == max(nums) else 1
        return res
