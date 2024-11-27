import marimo

__generated_with = "0.9.26"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3364](https://leetcode.com/problems/minimum-positive-sum-subarray)""")
    return


@app.cell
def __():
    from typing import List
    from math import inf
    return List, inf


@app.cell
def __(List, inf):
    class Solution:
        def minimumSumSubarray(self, nums: List[int], l: int, r: int) -> int:
            n, res = len(nums), inf
            for i in range(1, n):
                nums[i] += nums[i - 1]
            for lo in range(n):
                for hi in range(lo + l - 1, min(n, lo + r)):
                    cur = nums[hi] - (nums[lo - 1] if lo else 0)
                    if cur > 0:
                        res = min(res, cur)
            res = res if res != inf else -1
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.minimumSumSubarray([3, -2, 1, 4], 2, 3) == 1
    return


@app.cell
def __(sol):
    assert sol.minimumSumSubarray([-2, 2, -3, 1], 2, 3) == -1
    return


@app.cell
def __(sol):
    assert sol.minimumSumSubarray([1, 2, 3, 4], 2, 4) == 3
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
