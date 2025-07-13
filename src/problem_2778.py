# class Solution:
#     def sumOfSquares(self, nums: List[int]) -> int:
#         res = sum(n ** 2 for i, n in enumerate(nums) if len(nums) % (i + 1) == 0)
#         return res

class Solution:
    def sumOfSquares(self, nums: List[int]) -> int:
        res, i, n = (0, 1, len(nums))
        while i * i <= n:
            j = n // i
            if i * j == n:
                res = res + nums[i - 1] ** 2
                if i != j:
                    res = res + nums[j - 1] ** 2
            i = i + 1
        return res
