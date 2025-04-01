class Solution:
    def projectionArea(self, grid: List[List[int]]) -> int:
        res, n = 0, len(grid)
        for r in range(n):
            res += max(grid[r])  # y projection
            res += sum(grid[r][c] > 0 for c in range(n))  # z projection
        for c in range(n):
            res += max(grid[r][c] for r in range(n))  # x projection
        return res
