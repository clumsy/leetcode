class Solution:
    def mySqrt(self, x: int) -> int:
        lo, hi = 0, x
        while lo < hi:
            mi = hi - (hi - lo) // 2
            if mi * mi > x:
                hi = mi - 1
            else:
                lo = mi
        return lo
