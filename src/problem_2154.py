import marimo

__generated_with = "0.7.9"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 2154](https://leetcode.com/problems/keep-multiplying-found-values-by-two)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def findFinalValue(self, nums: List[int], original: int) -> int:
            nums = set(nums)
            while original in nums:
                original *= 2
            return original
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.findFinalValue([5,3,6,1,12], 3) == 24
    return


@app.cell
def __(sol):
    assert sol.findFinalValue([2,7,9], 4) == 4
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
