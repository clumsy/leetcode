class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        n = len(grid)
        b = set(range(1, n * n + 1))
        for r in range(n):
            for c in range(n):
                g = grid[r][c]
                if g not in b:
                    a = g
                else:
                    b.remove(g)
        res = [a, b.pop()]
        return res
