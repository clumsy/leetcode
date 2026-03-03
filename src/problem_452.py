class Solution:
    def findMinArrowShots(self, points: List[List[int]]) -> int:
        points.sort(key=lambda p: p[1])
        res, prv = 1, points[0][1]
        for s, e in points:
            if s <= prv:
                continue
            res += 1
            prv = e
        return res
