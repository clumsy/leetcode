import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def _(mo):
    mo.md(
        r"""
        [Problem 1037](https://leetcode.com/problems/valid-boomerang/description)
        """
    )
    return


@app.cell
def _():
    from typing import List
    return List,


@app.cell
def _(List):
    class Solution:
        def isBoomerang(self, points: List[List[int]]) -> bool:
            def area(a, b, c):
                return (b[0] - a[0])*(c[1] - b[1]) - (c[0] - b[0])*(b[1] - a[1])
            res = area(*points) != 0
            return res
    return Solution,


@app.cell
def _(Solution):
    sol = Solution()
    return sol,


@app.cell
def _(sol):
    assert sol.isBoomerang([[1,1],[2,3],[2,2]])
    return


@app.cell
def _(sol):
    assert not sol.isBoomerang([[1,1],[2,2],[3,3]])
    return


@app.cell
def _():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()

