import marimo

__generated_with = "0.6.22"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(rf"[Problem 3194](https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements)")
    return


@app.cell
def __():
    from typing import List
    from math import inf
    return List, inf


@app.cell
def __(List, inf):
    class Solution:
        def minimumAverage(self, nums: List[int]) -> float:
            nums.sort()
            res = inf
            for i in range(len(nums) // 2):
                res = min(res, (nums[i] + nums[-(i + 1)]) / 2)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumAverage([7,8,3,4,15,13,4,1]) == 5.5
    return


@app.cell
def __(sol):
    assert sol.minimumAverage([1,9,8,3,10,5]) == 5.5
    return


@app.cell
def __(sol):
    assert sol.minimumAverage([1,2,3,7,8,9]) == 5.0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
