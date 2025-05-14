class Solution:
    def maximumScoreAfterOperations(self, edges: List[List[int]], values: List[int]) -> int:
        es = defaultdict(list)
        for f, t in edges:
            es[f].append(t)
            es[t].append(f)
        # returns a, b
        # a - full sum in childs
        # b - max sum if we drop in childs
        def dfs(i, p=None):
            s, ms = 0, -values[i]
            for e in es[i]:
                if e != p:
                    ms = max(ms, 0)
                    ds, dms = dfs(e, p=i)
                    s += ds
                    ms += dms
            return s + values[i], max(s, ms + values[i])
        res = dfs(0)[1]
        return res
