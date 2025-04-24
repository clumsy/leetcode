class Solution:
    def findChampion(self, grid: List[List[int]]) -> int:
        n = len(grid)
        for i, r in enumerate(grid):
            if sum(r) == n - 1:
                res = i
                break
        return res
