import marimo

__generated_with = "0.6.23"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(rf"[Problem 3195](https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i)")
    return


@app.cell
def __():
    from typing import List
    from math import inf
    return List, inf


@app.cell
def __(List, inf):
    class Solution:
        def minimumArea(self, g: List[List[int]]) -> int:
            rs, cs = len(g), len(g[0])
            u, d, l, r = -inf, inf, inf, -inf
            for i in range(rs):
                for j in range(cs):
                    if g[i][j] == 1:
                        l, r = min(l, j), max(r, j)
                        d, u = min(d, i), max(u, i)
            res = (u - d + 1) * (r - l + 1)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumArea([[0,1,0],[1,0,1]]) == 6
    return


@app.cell
def __(sol):
    assert sol.minimumArea([[1,0],[0,0]]) == 1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
