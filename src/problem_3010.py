import marimo

__generated_with = "0.4.10"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3010](https://leetcode.com/problems/divide-an-array-into-subarrays-with-minimum-cost-i)")
    return


@app.cell
def __():
    from typing import List
    from math import inf
    return List, inf


@app.cell
def __(List, inf):
    class Solution:
        def minimumCost(self, nums: List[int]) -> int:
            mi1 = mi2 = inf
            for i in nums[1:]:
                if i < mi1:
                    mi2, mi1 = mi1, i
                elif i < mi2:
                    mi2 = i
            res = nums[0] + mi1 + mi2
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumCost([1,2,3,12]) == 6
    return


@app.cell
def __(sol):
    assert sol.minimumCost([5,4,3]) == 12
    return


@app.cell
def __(sol):
    assert sol.minimumCost([10,3,1,1]) == 12
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
