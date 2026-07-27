class Solution:
    def finishTime(self, n: int, es: List[List[int]], bt: List[int]) -> int:
        cs = defaultdict(list)
        for u, v in es:
            cs[u].append(v)

        def dfs(c):
            if not cs[c]:
                return bt[c]
            lo, hi = inf, -inf
            for i in cs[c]:
                ct = dfs(i)
                lo, hi = min(lo, ct), max(hi, ct)
            od = hi - lo + bt[c]
            return hi + od

        res = dfs(0)
        return res
