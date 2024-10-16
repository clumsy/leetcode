import marimo

__generated_with = "0.9.9"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3314](https://leetcode.com/problems/construct-the-minimum-bitwise-array-i)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def minBitwiseArray(self, nums: List[int]) -> List[int]:
            res = [-1 if i == 2 else i - (((i + 1) & -(i + 1)) >> 1) for i in nums]
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.minBitwiseArray([2,3,5,7]) == [-1,1,4,3]
    return


@app.cell
def __(sol):
    assert sol.minBitwiseArray([11,13,31]) == [9,12,15]
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
