class Solution:
    def sumIndicesWithKSetBits(self, nums: List[int], k: int) -> int:
        res = sum(e for i, e in enumerate(nums) if sum(d == "1" for d in bin(i)[2:]) == k)
        return res
