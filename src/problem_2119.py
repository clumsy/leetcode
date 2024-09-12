import marimo

__generated_with = "0.8.19"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2119](https://leetcode.com/problems/a-number-after-a-double-reversal)""")
    return


@app.cell
def __():
    class Solution:
        def isSameAfterReversals(self, num: int) -> bool:
            res = num == 0 or num % 10 != 0
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.isSameAfterReversals(526)
    return


@app.cell
def __(sol):
    assert not sol.isSameAfterReversals(1800)
    return


@app.cell
def __(sol):
    assert sol.isSameAfterReversals(0)
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
