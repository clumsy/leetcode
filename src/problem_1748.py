class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        res = sum(k for k, v in Counter(nums).items() if v == 1)
        return res
