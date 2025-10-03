class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        h = m = len(grid[0])
        res = 0
        for r in range(len(grid)):
            lo, hi = 0, h
            while lo < hi:
                mi = lo + (hi - lo) // 2
                if grid[r][mi] < 0:
                    hi = mi
                else:
                    lo = mi + 1
            res += m - lo
            h = lo
        return res
