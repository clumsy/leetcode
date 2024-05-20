import marimo

__generated_with = "0.5.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3151](https://leetcode.com/problems/special-array-i)")
    return


@app.cell
def __():
    from typing import List
    from itertools import pairwise
    return List, pairwise


@app.cell
def __(List, pairwise):
    class Solution:
        def isArraySpecial(self, nums: List[int]) -> bool:
            res = all(i & 1 != j & 1for i, j in pairwise(nums))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.isArraySpecial([1])
    return


@app.cell
def __(sol):
    assert sol.isArraySpecial([2,1,4])
    return


@app.cell
def __(sol):
    assert not sol.isArraySpecial([4,3,1,6])
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
