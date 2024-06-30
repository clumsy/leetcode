import marimo

__generated_with = "0.6.24"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(rf"[Problem 3178](https://leetcode.com/problems/find-the-child-who-has-the-ball-after-k-seconds)")
    return


@app.cell
def __():
    class Solution:
        def numberOfChild(self, n: int, k: int) -> int:
            k %= (2 * n - 2)
            res = k if k < n - 1 else n - 1 - (k - (n - 1))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.numberOfChild(3, 5) == 1
    return


@app.cell
def __(sol):
    assert sol.numberOfChild(5, 6) == 2
    return


@app.cell
def __(sol):
    assert sol.numberOfChild(4, 2) == 2
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
