class Solution:
    def coloredCells(self, n: int) -> int:
        res = 1 + (2 * 0 + 4 * (n - 1)) * n // 2
        return res
