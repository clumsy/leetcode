import marimo

__generated_with = "0.3.8"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2441](https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def findMaxK(self, nums: List[int]) -> int:
            nums = set(nums)
            res = -1
            for i in nums:
                if i > 0 and -i in nums:
                    res = max(res, i)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.findMaxK([-1,2,-3,3]) == 3
    return


@app.cell
def __(sol):
    assert sol.findMaxK([-1,10,6,7,-7,1]) == 7
    return


@app.cell
def __(sol):
    assert sol.findMaxK([-10,8,6,7,-2,-3]) == -1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
