class Solution:
    def cyclicShift(
        self, n: int, g: list[list[int]], rs: list[int], cs: list[int]
    ) -> list[list[int]]:
        res = [[0] * n for _ in range(n)]
        for r in range(n):
            for c in range(n):
                c_ = (c - rs[r] + n) % n
                r_ = (r - cs[c_] + n) % n
                res[r_][c_] = g[r][c]
        return res
