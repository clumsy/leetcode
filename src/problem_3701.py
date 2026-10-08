class Solution:
    def alternatingSum(self, nums: List[int]) -> int:
        res = sum((1 if i & 1 == 0 else -1) * e for i, e in enumerate(nums))
        return res
