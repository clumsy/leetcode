import marimo

__generated_with = "0.8.15"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2124](https://leetcode.com/problems/check-if-all-as-appears-before-all-bs)""")
    return


@app.cell
def __():
    class Solution:
        def checkString(self, s: str) -> bool:
            return "ba" not in s
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.checkString("aaabbb")
    return


@app.cell
def __(sol):
    assert not sol.checkString("abab")
    return


@app.cell
def __(sol):
    assert sol.checkString("bbb")
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
