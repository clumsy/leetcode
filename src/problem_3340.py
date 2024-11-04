import marimo

__generated_with = "0.9.14"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3340](https://leetcode.com/problems/check-balanced-string)""")
    return


@app.cell
def __():
    class Solution:
        def isBalanced(self, num: str) -> bool:
            res = sum(int(i) for i in num[::2]) == sum(int(i) for i in num[1::2])
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert not sol.isBalanced("1234")
    return


@app.cell
def __(sol):
    assert sol.isBalanced("24123")
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
