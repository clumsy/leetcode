import marimo

__generated_with = "0.5.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3148](https://leetcode.com/problems/maximum-difference-score-in-a-grid)")
    return


@app.cell
def __():
    from typing import List
    from math import inf
    return List, inf


@app.cell
def __(List, inf):
    class Solution:
        def maxScore(self, g: List[List[int]]) -> int:
            res, m, n = -inf, len(g), len(g[0])
            for r in range(m):
                for c in range(n):
                    lft = g[r][c - 1] if c else inf
                    top = g[r - 1][c] if r else inf
                    cur = g[r][c] - min(lft, top)
                    res = max(res, cur)
                    g[r][c] -= max(0, cur)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maxScore([[9,5,7,3],[8,9,6,1],[6,7,14,3],[2,5,3,1]]) == 9
    return


@app.cell
def __(sol):
    assert sol.maxScore([[4,3,2],[3,2,1]]) == -1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
