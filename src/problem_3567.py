class Solution:
    def minAbsDiff(self, g: List[List[int]], k: int) -> List[List[int]]:
        rs, cs = len(g), len(g[0])
        res = []
        for r in range(rs - k + 1):
            res.append([])
            unq = defaultdict(int)
            for c in range(cs):
                if c >= k:
                    for i in range(k):
                        unq[g[r + i][c - k]] -= 1
                for i in range(k):
                    unq[g[r + i][c]] += 1
                if c >= k - 1:
                    vs = sorted(k for k, v in unq.items() if v > 0)
                    res[-1].append(min((abs(v2 - v1) for v1, v2 in zip(vs[:-1], vs[1:])), default=0))
        return res
