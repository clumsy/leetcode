class Solution:
    def findRightInterval(self, intervals: List[List[int]]) -> List[int]:
        res, n = [], len(intervals)
        a = sorted((e[0], i) for i, e in enumerate(intervals))
        for i in intervals:
            lo = bisect_left(a, (i[1],))
            res.append(-1 if lo >= n else a[lo][1])
        return res
