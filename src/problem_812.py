class Solution:
    def largestTriangleArea(self, points: List[List[int]]) -> float:
        res = 0
        def area(x, y, z):
            x1, y1 = points[x]
            x2, y2 = points[y]
            x3, y3 = points[z]
            #         | x1 y1 1 |
            # A = 1/2 | x2 y2 1 |
            #         | x3 y3 1 |
            return 0.5 * (x1*y2 + x2*y3 + x3*y1 - x3*y2 - x2*y1 - x1*y3)
        n = len(points)
        for x in range(n):
            for y in range(n):
                for z in range(n):
                    res = max(res, area(x, y, z))
        return res
