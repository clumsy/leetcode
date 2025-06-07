class Solution:
    def hasTrailingZeros(self, nums: List[int]) -> bool:
        res = sum(i & 1 == 0 for i in nums) > 1
        return res
