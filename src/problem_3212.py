import marimo

__generated_with = "0.7.9"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"[Problem 3212](https://leetcode.com/problems/count-submatrices-with-equal-frequency-of-x-and-y)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def numberOfSubmatrices(self, g: List[List[str]]) -> int:
            res, cs = 0, len(g[0])
            prv = [[0, 0] for _ in range(cs)]
            acc = [[0, 0] for _ in range(cs)]
            for r in range(len(g)):
                for c in range(cs):
                    x = (acc[c - 1][0] - prv[c - 1][0] if c else 0) + prv[c][0] + (g[r][c] == "X")
                    y = (acc[c - 1][1] - prv[c - 1][1] if c else 0) + prv[c][1] + (g[r][c] == "Y")
                    acc[c] = [x, y]
                    res += acc[c][0] == acc[c][1] > 0
                prv, acc = acc, [[0, 0] for _ in range(cs)]
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.numberOfSubmatrices([["X","Y","."],["Y",".","."]]) == 3
    return


@app.cell
def __(sol):
    assert sol.numberOfSubmatrices([["X","X"],["X","Y"]]) == 0
    return


@app.cell
def __(sol):
    assert sol.numberOfSubmatrices([[".","."],[".","."]]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
