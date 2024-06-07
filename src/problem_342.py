import marimo

__generated_with = "0.6.16"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 342](https://leetcode.com/problems/power-of-four)")
    return


@app.cell
def __():
    class Solution:
        def isPowerOfFour(self, n: int) -> bool:
            res = n > 0 and n & -n == n and 0b1010101010101010101010101010101 & n == n
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.isPowerOfFour(16)
    return


@app.cell
def __(sol):
    assert not sol.isPowerOfFour(5)
    return


@app.cell
def __(sol):
    assert sol.isPowerOfFour(1)
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
