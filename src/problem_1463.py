class Solution:
    def cherryPickup(self, grid: List[List[int]]) -> int:
        rows, cols = len(grid), len(grid[0])
        dp = [[[-1 for _ in range(cols)] for _ in range(cols)] for _ in range(rows)]
        dp[0][0][cols - 1] = grid[0][0] + grid[0][cols - 1]
        for r in range(1, rows):
            for f in range(cols):
                for s in range(cols):
                    best = max(
                        (
                            dp[r - 1][fp][sp]
                            for fp in range(f - 1, f + 2)
                            for sp in range(s - 1, s + 2)
                            if 0 <= fp < cols and 0 <= sp < cols and dp[r - 1][fp][sp] >= 0
                        ),
                        default=-1,
                    )
                    if best >= 0:
                        gain = grid[r][f] + grid[r][s] * int(f != s)
                        dp[r][f][s] = max(dp[r][f][s], best + gain)
        res = max(dp[rows - 1][f][s] for f in range(cols) for s in range(cols))
        return res
