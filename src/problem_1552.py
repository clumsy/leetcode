class Solution:
    def maxDistance(self, position: List[int], m: int) -> int:
        p, n = sorted(position), len(position)
        lo, hi = 0, p[-1] - 1
        while lo < hi:
            res = hi - (hi - lo) // 2
            k, cur = m - 1, 0
            while k and cur < n:
                cur = bisect_left(p, p[cur] + res, lo=cur + 1)
                k -= 1
            if cur >= n:
                hi = res - 1
            else:
                lo = res
        return hi
