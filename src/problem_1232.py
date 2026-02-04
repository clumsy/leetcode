class Solution:
    def checkStraightLine(self, c: List[List[int]]) -> bool:
        def area(i, j, k):
            return (c[j][0] - c[i][0]) * (c[k][1] - c[j][1]) - (c[k][0] - c[j][0]) * (c[j][1] - c[i][1])

        res = all(area(0, 1, i) == 0 for i in range(2, len(c)))
        return res
