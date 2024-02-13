import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 1334](https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance)")
    return


@app.cell
def __():
    from typing import List
    from math import inf
    return List, inf


@app.cell
def __(List, inf):
    class Solution:
        def findTheCity(self, n: int, edges: List[List[int]], dt: int) -> int:
            dst = [[0 if c == r else inf for c in range(n)] for r in range(n)]
            for f, t, w in edges:
                dst[f][t] = dst[t][f] = w
            for k in range(n):
                for i in range(n):
                    for j in range(n):
                        dst[i][j] = min(dst[i][j], dst[i][k] + dst[k][j])
            res, mi = 0, inf
            for f in range(n):
                cur = sum(dst[f][t] <= dt for t in range(n) if f != t)
                if cur <= mi:
                    mi, res = cur, f
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.findTheCity(4, [[0,1,3],[1,2,1],[1,3,4],[2,3,1]], 4) == 3
    return


@app.cell
def __(sol):
    assert sol.findTheCity(5, [[0,1,2],[0,4,8],[1,2,3],[1,4,2],[2,3,1],[3,4,1]], 2) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
