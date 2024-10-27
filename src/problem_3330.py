import marimo

__generated_with = "0.9.14"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3330](https://leetcode.com/problems/find-the-original-typed-string-i)""")
    return


@app.cell
def __():
    class Solution:
        def possibleStringCount(self, w: str) -> int:
            res = 1 + sum(w[i] == w[i - 1] for i in range(1, len(w)))
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.possibleStringCount("abbcccc") == 5
    return


@app.cell
def __(sol):
    assert sol.possibleStringCount("abcd") == 1
    return


@app.cell
def __(sol):
    assert sol.possibleStringCount("aaaa") == 4
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
