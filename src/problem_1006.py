import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def _(mo):
    mo.md("[Problem 1006](https://leetcode.com/problems/clumsy-factorial)")
    return


@app.cell
def _():
    class Solution:
        def clumsy(self, n: int) -> int:
            res, sign = 0, 1
            while n > 3:
                res += sign * (n * (n - 1) // (n - 2)) + n - 3
                n -= 4
                sign = -1
            if n > 2:
                res += sign * (n * (n - 1) // (n - 2))
            elif n > 1:
                res += sign * n * (n - 1)
            else:
                res += sign * n
            return res
    return Solution,


@app.cell
def _(Solution):
    sol = Solution()
    return sol,


@app.cell
def _(sol):
    assert sol.clumsy(4) == 7
    return


@app.cell
def _(sol):
    assert sol.clumsy(10) == 12
    return


@app.cell
def _():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()

