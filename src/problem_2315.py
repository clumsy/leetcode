import marimo

__generated_with = "0.9.1"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2315](https://leetcode.com/problems/count-asterisks)""")
    return


@app.cell
def __():
    class Solution:
        def countAsterisks(self, s: str) -> int:
            res = sum(c.count("*") for c in s.split("|")[::2])
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.countAsterisks("l|*e*et|c**o|*de|") == 2
    return


@app.cell
def __(sol):
    assert sol.countAsterisks("iamprogrammer") == 0
    return


@app.cell
def __(sol):
    assert sol.countAsterisks("yo|uar|e**|b|e***au|tifu|l") == 5
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
