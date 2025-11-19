# class Solution:
#     def subsetXORSum(self, nums: List[int]) -> int:
#         res, n = (0, len(nums))
#         for msk in range(2 ** n):
#             s = 0
#             for i in range(n):
#                 if msk & 1 << i == 1 << i:
#                     s = s ^ nums[i]
#             res = res + s
#         return res


class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:
        res, n = (0, len(nums))
        for i in nums:
            res = res | i
        res = res * 2 ** (n - 1)
        return res
