import marimo

__generated_with = "0.6.24"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(rf"[Problem 3200](https://leetcode.com/problems/maximum-height-of-a-triangle)")
    return


@app.cell
def __():
    from math import sqrt, floor
    return floor, sqrt


@app.cell
def __(floor, sqrt):
    class Solution:
        def maxHeightOfTriangle(self, red: int, blue: int) -> int:
            # (a0 + a0 + d(n - 1))*n/2 -> (2a0 + 2n - 2)n/2 -> n^2 + n(a0 - 1) = x
            # n = -(a0 - sqrt(1 + 4x(a0 - 1)))/2
            def solve(a0, x):
                a0 -= 1
                res = (sqrt(1 + 4 * x * a0) - a0) / 2 if a0 != 0 else sqrt(x)
                return floor(res)
            nr1, nb1 = (solve(a0, x) for a0, x in zip([1, 2], [red, blue]))
            nb2, nr2 = (solve(a0, x) for a0, x in zip([1, 2], [blue, red]))
            nr1, nb1 = min(nr1, nb1 + 1), min(nb1, nr1)
            nb2, nr2 = min(nb2, nr2 + 1), min(nr2, nb2)
            res = max(nr1 + nb1, nr2 + nb2)
            return res

    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maxHeightOfTriangle(2, 4) == 3
    return


@app.cell
def __(sol):
    assert sol.maxHeightOfTriangle(2, 1) == 2
    return


@app.cell
def __(sol):
    assert sol.maxHeightOfTriangle(1, 1) == 1
    return


@app.cell
def __(sol):
    assert sol.maxHeightOfTriangle(10, 1) == 2
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
