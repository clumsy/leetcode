class Solution:
    def findBall(self, grid: List[List[int]]) -> List[int]:
        m, n = len(grid), len(grid[0])

        def dfs(c):
            r = 0
            while r < m:
                if grid[r][c] == 1:
                    if c == n - 1 or grid[r][c + 1] == -1:
                        c = -1
                        break
                    else:
                        c += 1
                else:
                    if c == 0 or grid[r][c - 1] == 1:
                        c = -1
                        break
                    else:
                        c -= 1
                r += 1
            return c

        res = [-1] * n
        for c in range(n):
            res[c] = dfs(c)
        return res
