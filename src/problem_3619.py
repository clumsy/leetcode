class Solution:
    def countIslands(self, g: List[List[int]], k: int) -> int:
        m, n = len(g), len(g[0])
        def dfs(r, c):
            res, g[r][c] = g[r][c], 0
            for dr, dc in ((0, 1), (1, 0), (-1, 0), (0, -1)):
                r_, c_ = r + dr, c + dc
                if 0 <= r_ < m and 0 <= c_ < n and g[r_][c_] > 0:
                    res += dfs(r_, c_)
            return res
        res = sum(dfs(r, c) % k == 0 for r in range(m) for c in range(n) if g[r][c])
        return res
