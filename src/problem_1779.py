class Solution:
    def nearestValidPoint(self, x: int, y: int, points: List[List[int]]) -> int:
        def manhattan(i):
            return abs(x - points[i][0]) + abs(y - points[i][1])

        res = min((i for i in range(len(points)) if points[i][0] == x or points[i][1] == y), key=manhattan, default=-1)
        return res
