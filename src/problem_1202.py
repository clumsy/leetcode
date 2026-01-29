class Solution:
    def smallestStringWithSwaps(self, s: str, pairs: List[List[int]]) -> str:
        class UnionFind:
            def __init__(self, n):
                self.prnt = [i for i in range(n)]
                self.heap = [[s[i]] for i in range(n)]

            def find(self, i):
                if self.prnt[i] != i:
                    self.prnt[i] = self.find(self.prnt[i])
                return self.prnt[i]

            def union(self, i, j):
                pi, pj = self.find(i), self.find(j)
                if pi != pj:
                    if len(self.heap[pi]) <= len(self.heap[pj]):
                        pi, pj = pj, pi
                    self.prnt[pj] = pi
                    for i in self.heap[pj]:
                        heappush(self.heap[pi], i)

        n = len(s)
        uf = UnionFind(n)
        for f, s in pairs:
            uf.union(f, s)
        res = [""] * n
        for i in range(n):
            res[i] = heappop(uf.heap[uf.find(i)])
        res = "".join(res)
        return res
