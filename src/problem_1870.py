class Solution:
    def minSpeedOnTime(self, dist: List[int], hour: float) -> int:
        top = int(1e7) + 1
        lo, hi, n = 1, top, len(dist)
        while lo < hi:  # since result is integer
            mi = lo + (hi - lo) // 2
            if sum(ceil(i / mi) for i in dist[:-1]) + dist[-1] / mi <= hour:
                hi = mi
            else:
                lo = mi + 1
        return -1 if lo >= top else lo
