import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def _(mo):
    mo.md(
        r"""
        [Problem 1903](https://leetcode.com/problems/largest-odd-number-in-string/description)
        """
    )
    return


@app.cell
def _():
    class Solution:
        def largestOddNumber(self, num: str) -> str:
            i = len(num) - 1
            while i >= 0 and num[i] not in "13579":
                i -= 1
            res = num[:i + 1]
            return res
    return Solution,


@app.cell
def _(Solution):
    sol = Solution()
    return sol,


@app.cell
def _(sol):
    assert sol.largestOddNumber("52") == "5"
    return


@app.cell
def _(sol):
    assert sol.largestOddNumber("4206") == ""
    return


@app.cell
def _(sol):
    assert sol.largestOddNumber("35427") == "35427"
    return


@app.cell
def _():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()

