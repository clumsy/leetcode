class Solution:
    def minDays(self, bloomDay: List[int], m: int, k: int) -> int:
        n, mb = len(bloomDay), max(bloomDay)
        if n < k * m:
            return -1
        lo, hi = 0, mb
        while lo < hi:
            day, b, f = lo + (hi - lo) // 2, 0, 0
            for bd in bloomDay:
                f = 0 if bd > day else f + 1
                if f == k:
                    f = 0
                    b += 1
                    if b == m:
                        break
            if b == m:
                hi = day
            else:
                lo = day + 1
        return lo
