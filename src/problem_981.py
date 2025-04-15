class TimeMap:
    def __init__(self):
        self.map = defaultdict(list)

    def set(self, key: str, value: str, timestamp: int) -> None:
        self.map[key].append((timestamp, value))

    def get(self, key: str, timestamp: int) -> str:
        cur = self.map[key]
        lo, hi = 0, len(cur) - 1
        while lo < hi:
            mi = hi - (hi - lo) // 2
            if cur[mi][0] > timestamp:
                hi = mi - 1
            else:
                lo = mi
        return cur[lo][1] if cur and cur[lo][0] <= timestamp else ""
