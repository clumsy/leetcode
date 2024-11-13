import marimo

__generated_with = "0.9.17"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3326](https://leetcode.com/problems/minimum-division-operations-to-make-array-non-decreasing)""")
    return


@app.cell
def __():
    from typing import List
    from math import isqrt
    return List, isqrt


@app.cell
def __(List, isqrt):
    class Solution:
        def minOperations(self, nums: List[int]) -> int:
            res = 0
            for i in reversed(range(len(nums) - 1)):
                if nums[i] > nums[i + 1]:
                    for k in range(2, min(nums[i + 1], isqrt(nums[i])) + 1):
                        if nums[i] % k == 0:
                            nums[i] = k
                            res += 1
                            break
                    else:
                        res = -1
                    if res < 0:
                        break
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.minOperations([25,7]) == 1
    return


@app.cell
def __(sol):
    assert sol.minOperations([7,7,6]) == -1
    return


@app.cell
def __(sol):
    assert sol.minOperations([1,1,1,1]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
