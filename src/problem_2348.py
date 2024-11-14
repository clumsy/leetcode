import marimo

__generated_with = "0.9.18"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2348](https://leetcode.com/problems/number-of-zero-filled-subarrays)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def zeroFilledSubarray(self, nums: List[int]) -> int:
            res = start = 0
            for i, e in enumerate(nums):
                if e != 0:
                    start = i + 1
                res += i - start + 1
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.zeroFilledSubarray([1,3,0,0,2,0,0,4]) == 6
    return


@app.cell
def __(sol):
    assert sol.zeroFilledSubarray([0,0,0,2,0,0]) == 9
    return


@app.cell
def __(sol):
    assert sol.zeroFilledSubarray([2,10,2019]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
