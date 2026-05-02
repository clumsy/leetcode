# class Solution:
#     def arrayNesting(self, nums: List[int]) -> int:
#         class UnionFind:
#             def __init__(self, n):
#                 self.prnt = [i for i in range(n)]
#                 self.size = [1] * n

#             def find(self, i):
#                 p = self.prnt[i]
#                 if p != i:
#                     self.prnt[i] = self.find(p)
#                 return self.prnt[i]

#             def union(self, i, j):
#                 pi, pj = (self.find(i), self.find(j))
#                 if pi != pj:
#                     if self.size[pi] < self.size[pj]:
#                         pi, pj = (pj, pi)
#                     self.prnt[pj] = pi
#                     self.size[pi] = self.size[pi] + self.size[pj]

#         uf = UnionFind(len(nums))
#         for i, e in enumerate(nums):
#             uf.union(i, e)
#         res = max(uf.size)
#         return res


class Solution:
    def arrayNesting(self, nums: List[int]) -> int:
        res, seen = (0, set())
        for i in nums:
            cur = 0
            while i not in seen:
                cur = cur + 1
                seen.add(i)
                i = nums[i]
            res = max(res, cur)
        return res
