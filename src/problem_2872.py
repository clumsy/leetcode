class Solution:
    def maxKDivisibleComponents(self, n: int, es: List[List[int]], vs: List[int], k: int) -> int:
        cnt = sum(v % k for v in vs)

        g = defaultdict(list)
        for f, t in es:
            g[f].append(t)
            g[t].append(f)

        def dfs(i, p=None):
            res = s = 0
            for c in g[i]:
                if c != p:
                    r_, s_ = dfs(c, i)
                    res += r_
                    s += s_
            s += vs[i]
            if s % k == (cnt - s) % k == 0:
                res += 1
                s = 0
            return res, s

        res = dfs(0)[0]
        return res
