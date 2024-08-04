import marimo

__generated_with = "0.8.0"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2144](https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount)""")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def minimumCost(self, cost: List[int]) -> int:
            cost.sort(reverse=True)
            res = 0
            for i, e in enumerate(cost):
                res += e if i % 3 != 2 else 0
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumCost([1,2,3]) == 5
    return


@app.cell
def __(sol):
    assert sol.minimumCost([6,5,7,9,2,2]) == 23
    return


@app.cell
def __(sol):
    assert sol.minimumCost([5,5]) == 10
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
