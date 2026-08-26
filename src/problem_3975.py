class Solution:
    def filterOccupiedIntervals(
        self, oi: List[List[int]], fs: int, fe: int
    ) -> List[List[int]]:
        res = []
        for s, e in oi:
            if s >= fs and e <= fe:
                continue
            if e < fs or s > fe:
                res.append([s, e])
            elif s < fs and e > fe:
                res.append([s, fs - 1])
                res.append([fe + 1, e])
            elif e > fe:
                res.append([fe + 1, e])
            else:
                res.append([s, fs - 1])
        oi, res = res, []
        oi.sort()
        for s, e in oi:
            if not res or s > res[-1][1] + 1:
                res.append([s, e])
            else:
                res[-1][1] = max(res[-1][1], e)
        return res
