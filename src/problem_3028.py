import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3028](https://leetcode.com/problems/ant-on-the-boundary)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def returnToBoundaryCount(self, nums: List[int]) -> int:
            res = cur = 0
            for i in nums:
                cur += i
                res += cur == 0
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.returnToBoundaryCount([2,3,-5]) == 1
    return


@app.cell
def __(sol):
    assert sol.returnToBoundaryCount([3,2,-3,-4]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
