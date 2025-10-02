# class Solution:
#     def makeConnected(self, n: int, connections: List[List[int]]) -> int:
#         class UnionFind:
#             def __init__(self, n):
#                 self.prnt = [i for i in range(n)]
#                 self.size = [1] * n

#             def find(self, i):
#                 p = self.prnt[i]
#                 if i != p:
#                     self.prnt[i] = self.find(p)
#                 return self.prnt[i]

#             def union(self, i, j):
#                 pi, pj = (self.find(i), self.find(j))
#                 if pi != pj:
#                     if self.size[pi] > self.size[pj]:
#                         pi, pj = (pj, pi)
#                     self.prnt[pi] = pj
#                     self.size[pj] = self.size[pj] + self.size[pi]
#         if len(connections) < n - 1:
#             res = -1
#         else:
#             uf = UnionFind(n)
#             for i, j in connections:
#                 uf.union(i, j)
#             for i in range(n):
#                 uf.find(i)
#             res = len(set(uf.prnt)) - 1
#             print(uf.prnt)
#         return res

class Solution:
    def makeConnected(self, n: int, connections: List[List[int]]) -> int:
        g = [set() for _ in range(n)]
        for i, j in connections:
            g[i].add(j)
            g[j].add(i)
        seen = [0] * n

        def dfs(i):
            if seen[i]:
                return 0
            seen[i] = 1
            for j in g[i]:
                dfs(j)
            return 1
        res = sum((dfs(i) for i in range(n))) - 1 if len(connections) >= n - 1 else -1
        return res
