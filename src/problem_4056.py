class Solution:
    def countIntersectingIntervals(self, ints: list[list[int]]) -> int:
        res = cur = 0
        q = sorted(i for s, e in ints for i in ((s, +1), (e + 1, -1)))
        for _, d in q:
            if d > 0:
                res += cur
            cur += d
        return res
