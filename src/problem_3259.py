import marimo

__generated_with = "0.8.3"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3259](https://leetcode.com/problems/maximum-energy-boost-from-two-drinks)""")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def maxEnergyBoost(self, eda: List[int], edb: List[int]) -> int:
            n = len(eda)
            for i in range(n):
                eda[i] += max(eda[i - 1] if i > 0 else 0, edb[i - 2] if i - 1 > 0 else 0)
                edb[i] += max(edb[i - 1] if i > 0 else 0, eda[i - 2] if i - 1 > 0 else 0)
            res = max(eda[i], edb[i])
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maxEnergyBoost([1,3,1], [3,1,1]) == 5
    return


@app.cell
def __(sol):
    assert sol.maxEnergyBoost([4,1,1], [1,1,3]) == 7
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
