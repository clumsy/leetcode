class Solution:
    def minTimeToVisitAllPoints(self, p: List[List[int]]) -> int:
        res = 0
        x0, y0 = p[0]
        for x, y in p[1:]:
            res += max(abs(x - x0), abs(y - y0))
            x0, y0 = x, y
        return res
