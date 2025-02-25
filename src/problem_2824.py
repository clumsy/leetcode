class Solution:
    def countPairs(self, nums: List[int], target: int) -> int:
        nums.sort()
        res = 0
        for i, e in enumerate(nums):
            j = bisect_left(nums, target - e, lo=i)
            res = res + max(0, j - i - 1)
        return res

# class Solution:
#     def countPairs(self, nums: List[int], target: int) -> int:
#         offset = 51

#         class FenwickTree:

#             def __init__(self, seq):
#                 self.tree = [0] * 102
#                 for i in seq:
#                     self.update(i, +1)

#             def query(self, i):
#                 i = min(i + offset, len(self.tree) - 1)
#                 res = 0
#                 while i > 0:
#                     res = res + self.tree[i]
#                     i = i - (-i & i)
#                 return res

#             def update(self, i, x):
#                 i = i + offset
#                 while i < len(self.tree):
#                     self.tree[i] = self.tree[i] + x
#                     i = i + (-i & i)
#         fen, res = (FenwickTree(nums), 0)
#         for i in nums:
#             fen.update(i, -1)
#             res = res + fen.query(target - i - 1)
#         return res
