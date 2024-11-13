import marimo

__generated_with = "0.7.5"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2016](https://leetcode.com/problems/maximum-difference-between-increasing-elements)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def maximumDifference(self, nums: List[int]) -> int:
            mi, res = nums[0], 0
            for i in range(1, len(nums)):
                res = max(res, nums[i] - mi)
                mi = min(mi, nums[i])
            res = res if res else -1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maximumDifference([7,1,5,4]) == 4
    return


@app.cell
def __(sol):
    assert sol.maximumDifference([9,4,3,2]) == -1
    return


@app.cell
def __(sol):
    assert sol.maximumDifference([1,5,2,10]) == 9
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()

