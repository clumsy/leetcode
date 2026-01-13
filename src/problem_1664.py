# class Solution:
#     def waysToMakeFair(self, nums: List[int]) -> int:
#         n = len(nums)
#         lft, rgt = ([[0] * 2 for _ in range(n)], [[0] * 2 for _ in range(n)])
#         for i in range(n):
#             lft[i][i & 1] = nums[i] + (lft[i - 2][i & 1] if i > 1 else 0)
#             lft[i][1 - i & 1] = lft[i - 1][1 - i & 1] if i > 0 else 0
#             j = n - 1 - i
#             rgt[j][j & 1] = nums[j] + (rgt[j + 2][j & 1] if j < n - 2 else 0)
#             rgt[j][1 - j & 1] = rgt[j + 1][1 - j & 1] if j < n - 1 else 0
#         res = 0
#         for i in range(n):
#             even = (lft[i - 1][0] if i > 0 else 0) + (rgt[i + 1][1] if i < n - 1 else 0)
#             odd = (lft[i - 1][1] if i > 0 else 0) + (rgt[i + 1][0] if i < n - 1 else 0)
#             res = res + (even == odd)
#         return res


class Solution:
    def waysToMakeFair(self, nums: List[int]) -> int:
        n = len(nums)
        lft, rgt = ([0] * 2, [0] * 2)
        for i in range(n):
            rgt[i & 1] = rgt[i & 1] + nums[i]
        res = 0
        for i in range(n):
            rgt[i & 1] = rgt[i & 1] - nums[i]
            res = res + (lft[0] + rgt[1] == lft[1] + rgt[0])
            lft[i & 1] = lft[i & 1] + nums[i]
        return res
