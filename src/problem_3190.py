import marimo

__generated_with = "0.6.23"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(rf"[Problem 3190](https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def minimumOperations(self, nums: List[int]) -> int:
            res = sum(i % 3 != 0 for i in nums)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumOperations([1,2,3,4]) == 3
    return


@app.cell
def __(sol):
    assert sol.minimumOperations([3,6,9]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
