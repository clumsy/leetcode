class Solution:
    def firstBadVersion(self, n: int) -> int:
        lo, hi = 1, n
        while lo < hi:
            mi = lo + (hi - lo) // 2
            if isBadVersion(mi):
                hi = mi
            else:
                lo = mi + 1
        return lo
