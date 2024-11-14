import marimo

__generated_with = "0.9.18"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 2914](https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful)""")
    return


@app.cell
def __():
    class Solution:
        def minChanges(self, s: str) -> int:
            res = sum(s[i] != s[i + 1] for i in range(0, len(s), 2))
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.minChanges("1001") == 2
    return


@app.cell
def __(sol):
    assert sol.minChanges("10") == 1
    return


@app.cell
def __(sol):
    assert sol.minChanges("0000") == 0
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
