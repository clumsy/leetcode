class SummaryRanges:
    def __init__(self):
        self.set = [False] * 10001

    def addNum(self, v: int) -> None:
        self.set[v] = True

    def getIntervals(self) -> List[List[int]]:
        res, s = [], None
        for i, v in enumerate(self.set):
            if s is not None and not v:
                res.append([s, i - 1])
                s = None
            elif s is None and v:
                s = i
        return res
