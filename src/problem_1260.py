class Solution:
    def shiftGrid(self, grid: List[List[int]], k: int) -> List[List[int]]:
        rows, cols = len(grid), len(grid[0])
        res = [[0] * cols for _ in range(rows)]
        for r in range(rows):
            for c in range(cols):
                res[r][c] = grid[(r - (k - c + cols - 1) // cols) % rows][(c - k) % cols]
        return res
