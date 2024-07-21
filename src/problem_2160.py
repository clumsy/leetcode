import marimo

__generated_with = "0.7.9"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 2160](https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits)")
    return


@app.cell
def __():
    class Solution:
        def minimumSum(self, num: int) -> int:
            s = sorted(str(num))
            res = int(s[0] + s[3]) + int(s[1] + s[2])
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumSum(2932) == 52
    return


@app.cell
def __(sol):
    assert sol.minimumSum(4009) == 13
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
