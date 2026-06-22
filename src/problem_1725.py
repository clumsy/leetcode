class Solution:
    def countGoodRectangles(self, rectangles: List[List[int]]) -> int:
        res = ma = 0
        for l, w in rectangles:
            mi = min(l, w)
            if mi > ma:
                res, ma = 0, mi
            res += mi == ma
        return res
