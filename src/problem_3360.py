import marimo

__generated_with = "0.9.23"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3360](https://leetcode.com/problems/stone-removal-game)""")
    return


@app.cell
def __():
    class Solution:
        def canAliceWin(self, n: int) -> bool:
            res, x = False, 10
            while n >= x:
                n -= x
                x -= 1
                res = not res
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.canAliceWin(12)
    return


@app.cell
def __(sol):
    assert not sol.canAliceWin(1)
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
