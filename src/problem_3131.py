import marimo

__generated_with = "0.4.10"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3131](https://leetcode.com/problems/find-the-integer-added-to-array-i)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def addedInteger(self, nums1: List[int], nums2: List[int]) -> int:
            res = min(nums2) - min(nums1)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.addedInteger([2,6,4], [9,7,5]) == 3
    return


@app.cell
def __(sol):
    assert sol.addedInteger([10], [5]) == -5
    return


@app.cell
def __(sol):
    assert sol.addedInteger([1,1,1,1], [1,1,1,1]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
