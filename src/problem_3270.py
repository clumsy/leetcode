import marimo

__generated_with = "0.8.7"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3270](https://leetcode.com/problems/find-the-key-of-the-numbers)""")
    return


@app.cell
def __():
    class Solution:
        def generateKey(self, num1: int, num2: int, num3: int) -> int:
            num1, num2, num3 = ("0" * (4 - len(s)) + s for s in map(str, (num1, num2, num3)))
            res = ""
            for i in range(4):
                res += min(num1[i], num2[i], num3[i])
            res = int(res.lstrip("0") or 0)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.generateKey(987, 879, 798) == 777
    return


@app.cell
def __(sol):
    assert sol.generateKey(1, 10, 1000) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
