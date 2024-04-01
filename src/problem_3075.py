import marimo

__generated_with = "0.3.8"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3075](https://leetcode.com/problems/maximize-happiness-of-selected-children)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def maximumHappinessSum(self, h: List[int], k: int) -> int:
            h.sort()
            n = len(h)
            res = sum(max(0, h[n - 1 - i] - i) for i in range(k))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maximumHappinessSum([1,2,3], 2) == 4
    return


@app.cell
def __(sol):
    assert sol.maximumHappinessSum([1,1,1,1], 2) == 1
    return


@app.cell
def __(sol):
    assert sol.maximumHappinessSum([2,3,4,5], 1) == 5
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
