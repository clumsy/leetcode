class Solution:
    def minMoves(self, nums: List[int]) -> int:
        res = max(nums) * len(nums) - sum(nums)
        return res
