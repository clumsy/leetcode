class Solution:
    def minCuttingCost(self, n: int, m: int, k: int) -> int:
        n, m = sorted((n, m))
        if m <= k:
            res = 0
        elif n <= k:
            res = (m - k) * k
        else:
            res = (n - k) * (m - k) * k * k
        return res
