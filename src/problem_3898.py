class Solution:
    def findDegrees(self, m: list[list[int]]) -> list[int]:
        n = len(m)
        res = [0] * n
        for r in range(n):
            for c in range(r + 1, n):
                d = m[r][c]
                res[r] += d
                res[c] += d
        return res
