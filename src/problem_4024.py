class Solution:
    def nearestDrone(self, ds: list[list[int]], t: list[int]) -> int:
        res, md = -1, inf
        for i, (x, y, d) in enumerate(ds):
            d_ = abs(t[0] - x) + abs(t[1] - y)
            if d_ <= d and d_ < md:
                res, md = i, d_
        return res
