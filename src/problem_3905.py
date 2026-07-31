class Solution:
    def colorGrid(self, n: int, m: int, ss: list[list[int]]) -> list[list[int]]:
        ss.sort(key=lambda x: -x[2])
        res = [[0] * m for _ in range(n)]
        for r, c, cc in ss:
            res[r][c] = cc
        for r, c, cc in ss:
            for dr, dc in ((1, 0), (0, 1), (-1, 0), (0, -1)):
                r_, c_ = r + dr, c + dc
                if 0 <= r_ < n and 0 <= c_ < m and res[r_][c_] == 0:
                    res[r_][c_] = cc
                    ss.append((r_, c_, cc))
        return res
