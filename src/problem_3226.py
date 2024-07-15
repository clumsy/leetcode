import marimo

__generated_with = "0.7.9"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"[Problem 3226](https://leetcode.com/problems/number-of-bit-changes-to-make-two-integers-equal)")
    return


@app.cell
def __():
    class Solution:
        def minChanges(self, n: int, k: int) -> int:
            diff = n ^ k
            res = -1 if ~n & diff else bin(n & diff)[2:].count("1")
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minChanges(13, 4) == 2
    return


@app.cell
def __(sol):
    assert sol.minChanges(21, 21) == 0
    return


@app.cell
def __(sol):
    assert sol.minChanges(14, 13) == -1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
