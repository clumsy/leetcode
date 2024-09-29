import marimo

__generated_with = "0.6.17"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(rf"[Problem 3300](https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def minElement(self, nums: List[int]) -> int:
            def count(i):
                res = 0
                while i:
                    i, d = divmod(i, 10)
                    res += d
                return res
            res = min(count(i) for i in nums)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minElement([10,12,13,14]) == 1
    return


@app.cell
def __(sol):
    assert sol.minElement([1,2,3,4]) == 1
    return


@app.cell
def __(sol):
    assert sol.minElement([999,19,199]) == 10
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
