class Solution:
    def maximumTripletValue(self, nums: List[int]) -> int:
        res = max_ij = max_i = 0
        for k in nums:
            res = max(res, max_ij * k)
            max_ij = max(max_ij, max_i - k)
            max_i = max(max_i, k)
        return res
