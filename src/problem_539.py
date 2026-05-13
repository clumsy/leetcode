# class Solution:
#     def findMinDifference(self, timePoints: List[str]) -> int:
#         for i, e in enumerate(timePoints):
#             timePoints[i] = int(e[3:]) + 60 * int(e[:2])
#         timePoints.sort()
#         res = timePoints[0] + 24 * 60 - timePoints[-1]
#         for i in range(len(timePoints) - 1):
#             res = min(res, timePoints[i + 1] - timePoints[i])
#         return res


class Solution:
    def findMinDifference(self, timePoints: List[str]) -> int:
        res = n = 1440
        tp = [False] * n
        for i, e in enumerate(timePoints):
            t = int(e[3:]) + 60 * int(e[:2])
            if tp[t]:
                res = 0
                break
            tp[t] = True
        i, n = (0, len(tp))
        while res and i < n:
            if tp[i]:
                j = (i + 1) % n
                while not tp[j]:
                    j = (j + 1) % n
                res = min(res, j - i if j > i else n - i + j)
                i = max(j, i + 1)
            else:
                i = i + 1
        return res
