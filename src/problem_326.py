import marimo

__generated_with = "0.6.24"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 326](https://leetcode.com/problems/power-of-three)")
    return


@app.cell
def __():
    class Solution:
        def isPowerOfThree(self, n: int) -> bool:
            res = (n > 0) and (3 ** 19 % n == 0)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.isPowerOfThree(27)
    return


@app.cell
def __(sol):
    assert not sol.isPowerOfThree(0)
    return


@app.cell
def __(sol):
    assert not sol.isPowerOfThree(-1)
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
