import marimo

__generated_with = "0.8.14"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3239](https://leetcode.com/problems/minimum-number-of-flips-to-make-binary-grid-palindromic-i)""")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def minFlips(self, g: List[List[int]]) -> int:
            m, n = len(g), len(g[0])
            rows = sum(g[r][c] != g[r][~c] for r in range(m) for c in range(n // 2))
            cols = sum(g[r][c] != g[~r][c] for c in range(n) for r in range(m // 2))
            res = min(rows, cols)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minFlips([[1,0,0],[0,0,0],[0,0,1]]) == 2
    return


@app.cell
def __(sol):
    assert sol.minFlips([[0,1],[0,1],[0,0]]) == 1
    return


@app.cell
def __(sol):
    assert sol.minFlips([[1],[0]]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
