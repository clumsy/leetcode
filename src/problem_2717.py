class Solution:
    def semiOrderedPermutation(self, nums: List[int]) -> int:
        n = len(nums)
        one, nth = nums.index(1), nums.index(n)
        res = one + (n - 1 - nth) - (1 if one > nth else 0)
        return res
