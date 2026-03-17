class Solution:
    def countCommas(self, n: int) -> int:
        res, cms, bgn = 0, 1, 1000
        while bgn <= n:
            end = bgn * 1000 - 1
            res += cms * max(0, min(n, end) - bgn + 1)
            bgn *= 1000
            cms += 1
        return res
