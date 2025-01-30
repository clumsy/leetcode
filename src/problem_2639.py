class Solution:
    def findColumnWidth(self, grid: List[List[int]]) -> List[int]:
        rows, cols = len(grid), len(grid[0])
        res = [0] * cols
        for c in range(cols):
            for r in range(rows):
                res[c] = max(res[c], len(str(grid[r][c])))
        return res
