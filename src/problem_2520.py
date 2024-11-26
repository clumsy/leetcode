import marimo

__generated_with = "0.9.23"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2520](https://leetcode.com/problems/count-the-digits-that-divide-a-number)""")
    return


@app.cell
def __():
    class Solution:
        def countDigits(self, num: int) -> int:
            res = sum(d != "0" and num % int(d) == 0 for d in str(num))
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.countDigits(7) == 1
    return


@app.cell
def __(sol):
    assert sol.countDigits(121) == 2
    return


@app.cell
def __(sol):
    assert sol.countDigits(1248) == 4
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
