import marimo

__generated_with = "0.8.21"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2303](https://leetcode.com/problems/calculate-amount-paid-in-taxes)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def calculateTax(self, b: List[List[int]], income: int) -> float:
            res = 0
            for i in range(len(b)):
                taxed = min(income, b[i][0] - (b[i - 1][0] if i > 0 else 0))
                res += taxed * b[i][1] / 100
                income -= taxed
                if income == 0:
                    break
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.calculateTax([[3,50],[7,10],[12,25]], 10) == 2.65
    return


@app.cell
def __(sol):
    assert sol.calculateTax([[1,0],[4,25],[5,50]], 2) == 0.25
    return


@app.cell
def __(sol):
    assert sol.calculateTax([[2,50]], 0) == 0
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
