import marimo

__generated_with = "0.6.10"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 35](https://leetcode.com/problems/search-insert-position/)")
    return


@app.cell
def __():
    from bisect import bisect_left
    from typing import List


    class Solution:
        def searchInsert(self, nums: List[int], target: int) -> int:
            return bisect_left(nums, target)
    return List, Solution, bisect_left


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.searchInsert([1,3,5,6], 5) == 2
    return


@app.cell
def __(sol):
    assert sol.searchInsert([1,3,5,6], 2) == 1
    return


@app.cell
def __(sol):
    assert sol.searchInsert([1,3,5,6], 7) == 4
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
