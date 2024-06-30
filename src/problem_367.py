import marimo

__generated_with = "0.6.24"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 367](https://leetcode.com/problems/valid-perfect-square)")
    return


@app.cell
def __():
    class Solution:
        def isPerfectSquare(self, num: int) -> bool:
            lo, hi = 1, num
            while lo < hi:
                mi = (lo + hi) // 2
                if mi * mi < num:
                    lo = mi + 1
                else:
                    hi = mi
            return lo * lo == num
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.isPerfectSquare(16)
    return


@app.cell
def __(sol):
    assert not sol.isPerfectSquare(14)
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
