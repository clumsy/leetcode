import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2485](https://leetcode.com/problems/find-the-pivot-integer)")
    return


@app.cell
def __():
    from math import sqrt
    return sqrt,


@app.cell
def __(sqrt):
    class Solution:
        def pivotInteger(self, n: int) -> int:
            # (1 + x) * x / 2 == (x + n) * (n + 1 - x) / 2
            # x^2 + x == n^2 + n + x - x^2
            # 2x^2 = n^2 + n
            x = int(sqrt((n + n**2) // 2))
            res = x if 2 * x**2 == n ** 2 + n else -1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.pivotInteger(8) == 6
    return


@app.cell
def __(sol):
    assert sol.pivotInteger(1) == 1
    return


@app.cell
def __(sol):
    assert sol.pivotInteger(4) == -1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
