class Solution:
    def minTime(self, n: int, es: List[List[int]]) -> int:
        g = defaultdict(list)
        for u, v, s, e in es:
            g[u].append((v, s, e))
        q, res = [(0, 0)], -1
        vis = set()
        while q:
            t, c = heappop(q)
            if c == n - 1:
                res = t
                break
            if c in vis:
                continue
            vis.add(c)
            for v, s, e in g[c]:
                if t <= e and v not in vis:
                    heappush(q, (max(s, t) + 1, v))
        return res
