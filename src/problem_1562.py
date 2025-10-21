# class UnionFind:
#     def __init__(self, n):
#         self.rank = [0] * n
#         self.parent = [i for i in range(n)]

#     def union(self, i, j):
#         i, j = (self.find(i), self.find(j))
#         if i != j:
#             if self.rank[i] < self.rank[j]:
#                 i, j = (j, i)
#             self.rank[i] = self.rank[i] + self.rank[j]
#             self.parent[j] = i

#     def find(self, i):
#         if i != self.parent[i]:
#             self.parent[i] = self.find(self.parent[i])
#         return self.parent[i]

# class Solution:
#     def findLatestStep(self, arr: List[int], m: int) -> int:
#         if m == len(arr):
#             return m
#         n, res = (len(arr), -1)
#         uf = UnionFind(n)
#         for i, e in enumerate(arr):
#             e = e - 1
#             uf.rank[e] = 1
#             for a in (e - 1, e + 1):
#                 if 0 <= a < n:
#                     if uf.rank[uf.find(a)] == m:
#                         res = i
#                     if uf.rank[a] > 0:
#                         uf.union(e, a)
#         return res


class Solution:
    def findLatestStep(self, arr: List[int], m: int) -> int:
        n = len(arr)
        if m == n:
            return m
        lens, res = ([0] * n, -1)
        for i, e in enumerate(arr):
            e = e - 1
            left, right = (lens[e - 1] if e > 0 else 0, lens[e + 1] if e < n - 1 else 0)
            lens[e - left] = lens[e + right] = left + right + 1
            if left == m or right == m:
                res = i
        return res
