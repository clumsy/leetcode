class Solution:
    def maxPoints(self, t1: List[int], t2: List[int], k: int) -> int:
        res, n = 0, len(t1)
        for i1, i2 in sorted(zip(t1, t2), key=lambda t: -abs(t[0] - t[1])):
            if n <= k:
                res += i1
            else:
                m = max(i1, i2)
                res += m
                k -= i1 == m
                n -= 1
        return res
