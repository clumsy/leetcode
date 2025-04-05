class Solution:
    def surfaceArea(self, grid: List[List[int]]) -> int:
        n, res = len(grid), 0
        for r in range(n):
            for c in range(n):
                res += 2 * (grid[r][c] > 0)  # top and bottom surfaces

                # top side surface
                res += max(0, grid[r][c] - grid[r - 1][c] * (r != 0))

                # right side surface
                res += max(0, grid[r][c] - grid[(r + 1) % n][c] * (r != n - 1))

                # left side surface
                res += max(0, grid[r][c] - grid[r][c - 1] * (c != 0))

                # bottom side surface
                res += max(0, grid[r][c] - grid[r][(c + 1) % n] * (c != n - 1))
        return res
