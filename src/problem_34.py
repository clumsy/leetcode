import marimo

__generated_with = "0.6.17"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 34](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array)")
    return


@app.cell
def __():
    from bisect import bisect_left, bisect_right
    from typing import List
    return List, bisect_left, bisect_right


@app.cell
def __(List, bisect_left, bisect_right):
    class Solution:
        def searchRange(self, nums: List[int], target: int) -> List[int]:
            lo, hi = bisect_left(nums, target), bisect_right(nums, target) - 1
            return [lo, hi] if lo <= hi else [-1, -1]
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.searchRange([5,7,7,8,8,10], 8) == [3,4]
    return


@app.cell
def __(sol):
    assert sol.searchRange([5,7,7,8,8,10], 6) == [-1,-1]
    return


@app.cell
def __(sol):
    assert sol.searchRange([], 0) == [-1,-1]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
