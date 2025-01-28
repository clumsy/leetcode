class Solution:
    def countPartitions(self, nums: List[int]) -> int:
        res = len(nums) - 1 if sum(nums) & 1 == 0 else 0
        return res
