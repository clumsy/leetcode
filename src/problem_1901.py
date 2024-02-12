import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def _(mo):
    mo.md(
        r"""
        [Problem 1901](https://leetcode.com/problems/find-a-peak-element-ii/)
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
        def findPeakGrid(self, mat: List[List[int]]) -> List[int]:
            m, n = len(mat), len(mat[0])
            lo, hi = 0, m - 1
            while lo < hi:
                mi = (lo + hi) // 2
                if max(mat[mi]) > max(mat[mi + 1]):
                    hi = mi
                else:
                    lo = mi + 1
            return [lo, max(range(n), key=lambda c: mat[lo][c])]
    return Solution,


@app.cell
def _(Solution):
    sol = Solution()
    return sol,


@app.cell
def _(sol):
    assert sol.findPeakGrid([[1,4],[3,2]]) == [0,1]
    return


@app.cell
def _(sol):
    assert sol.findPeakGrid([[10,20,15],[21,30,14],[7,16,32]]) == [2,2]
    return


@app.cell
def _():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()

