class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        lo, hi, piles = 1, max(piles), sorted(piles)
        while lo < hi:
            mi = lo + (hi - lo) // 2
            x = sum(ceil(i / mi) for i in piles)
            if x <= h:
                hi = mi
            else:
                lo = mi + 1
        return lo
