class Solution:
    def countCompleteComponents(self, n: int, edges: List[List[int]]) -> int:
        class UnionFind:
            def __init__(self, n):
                self.prnt = [i for i in range(n)]
                self.size = [1] * n

            def find(self, i):
                p = self.prnt[i]
                if i != p:
                    self.prnt[i] = self.find(p)
                return self.prnt[i]

            def union(self, i, j):
                pi, pj = self.find(i), self.find(j)
                if pi != pj:
                    if self.size[pi] < self.size[pj]:
                        pi, pj = pj, pi
                    self.prnt[pj] = pi
                    self.size[pi] += self.size[pj]
                return pi

        cnt = defaultdict(int)
        uf = UnionFind(n)
        for i, j in edges:
            cnt[i] += 1
            cnt[j] += 1
            uf.union(i, j)
        valid = Counter(uf.find(i) for i in range(n) if cnt[i] == uf.size[uf.find(i)] - 1)
        res = sum(v == uf.size[k] for k, v in valid.items())
        return res
