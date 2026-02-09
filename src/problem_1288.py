class Solution:
    def removeCoveredIntervals(self, intervals: List[List[int]]) -> int:
        intervals.sort(key=lambda x: (x[0], -x[1]))
        res, top = len(intervals), 0
        for _, ri in intervals:
            if ri <= top:
                res -= 1
            else:
                top = ri
        return res
