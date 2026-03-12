class Solution:
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        res, rows, cols = 0, len(grid), len(grid[0])
        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == 1:
                    res += sum(
                        r1 < 0 or r1 >= rows or c1 < 0 or c1 >= cols or grid[r1][c1] == 0
                        for r1, c1 in (
                            (r + 1, c),
                            (r - 1, c),
                            (r, c + 1),
                            (r, c - 1),
                        )
                    )
        return res
