import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3024](https://leetcode.com/problems/type-of-triangle)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def triangleType(self, nums: List[int]) -> str:
            nums.sort()
            if nums[2] >= nums[0] + nums[1]:
                res = "none"
            elif nums[0] == nums[2]:
                res = "equilateral"
            elif nums[0] == nums[1] or nums[1] == nums[2]:
                res = "isosceles"
            else:
                res = "scalene"
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.triangleType([3,3,3]) == "equilateral"
    return


@app.cell
def __(sol):
    assert sol.triangleType([3,4,5]) == "scalene"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
