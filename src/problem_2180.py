import marimo

__generated_with = "0.8.13"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2180](https://leetcode.com/problems/count-integers-with-even-digit-sum)""")
    return


@app.cell
def __():
    class Solution:
        def countEven(self, num: int) -> int:
            res = num // 2 if sum(int(d) for d in str(num)) & 1 == 0 else (num - 1) // 2
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countEven(4) == 2
    return


@app.cell
def __(sol):
    assert sol.countEven(30) == 14
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
