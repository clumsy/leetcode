class Solution:
    def minCostConnectPoints(self, points: List[List[int]]) -> int:
        class union_find:
            def __init__(self, n):
                self.n = n
                self.pt = [i for i in range(n)]
                self.sz = [1] * n

            def union(self, i, j):
                pti, ptj = self.find(i), self.find(j)
                if pti != ptj:
                    if self.sz[pti] < self.sz[ptj]:
                        i, j = j, i
                        pti, ptj = ptj, pti
                    self.pt[ptj] = i
                    self.sz[pti] += self.sz[ptj]

            def find(self, i):
                if i != self.pt[i]:
                    self.pt[i] = self.find(self.pt[i])
                return self.pt[i]

        # Kruskal
        e, n = [], len(points)
        for i in range(n - 1):
            for j in range(i + 1, n):
                p1, p2 = points[i], points[j]
                d = abs(p1[0] - p2[0]) + abs(p1[1] - p2[1])
                heappush(e, (d, i, j))
        res, comp = 0, union_find(n)
        while e:
            d, i, j = heappop(e)
            if comp.find(i) != comp.find(j):
                res += d
                comp.union(i, j)
        return res
