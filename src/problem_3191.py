import marimo

__generated_with = "0.6.23"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(rf"[Problem 3191](https://leetcode.com/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-i)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def minOperations(self, nums: List[int]) -> int:
            res = 0
            for i in range(len(nums) - 2):
                if nums[i] == 0:
                    nums[i + 1] = 1 - nums[i + 1]
                    nums[i + 2] = 1 - nums[i + 2]
                    res += 1
            res = -1 if any(i == 0 for i in nums[-2:]) else res
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minOperations([0,1,1,1,0,0]) == 3
    return


@app.cell
def __(sol):
    assert sol.minOperations([0,1,1,1]) == -1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
