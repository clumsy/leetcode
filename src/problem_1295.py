# class Solution:
#     def findNumbers(self, nums: List[int]) -> int:
#         res = sum(len(str(i)) & 1 == 0 for i in nums)
#         return res


class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        res = sum((floor(log10(i) + 1) & 1 == 0 for i in nums))
        return res
