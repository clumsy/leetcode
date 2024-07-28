import marimo

__generated_with = "0.7.19"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2169](https://leetcode.com/problems/count-operations-to-obtain-zero)""")
    return


@app.cell
def __():
    class Solution:
        def countOperations(self, num1: int, num2: int) -> int:
            num1, num2 = sorted([num1, num2])
            res = 0
            while num1 > 0:
                d, r = divmod(num2, num1)
                res += d
                num1, num2 = r, num1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countOperations(2, 3) == 3
    return


@app.cell
def __(sol):
    assert sol.countOperations(10, 10) == 1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
