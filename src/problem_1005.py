import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def _(mo):
    mo.md(
        r"""
        [Problem 1005](https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/description)
        """
    )
    return


@app.cell
def _():
    from typing import List
    return List,


@app.cell
def _(List):
    class Solution:
        def largestSumAfterKNegations(self, nums: List[int], k: int) -> int:
            nums.sort()
            i, n = 0, len(nums)
            while k > 0 and i < n and nums[i] < 0:
                nums[i] *= -1
                k -= 1
                i += 1
            res = sum(nums) - (k & 1) * 2 * min(nums)
            return res
    return Solution,


@app.cell
def _(Solution):
    sol = Solution()
    return sol,


@app.cell
def _(sol):
    assert sol.largestSumAfterKNegations([4,2,3], 1) == 5
    return


@app.cell
def _(sol):
    assert sol.largestSumAfterKNegations([3,-1,0,2], 3) == 6
    return


@app.cell
def _(sol):
    assert sol.largestSumAfterKNegations([2,-3,-1,5,-4], 2) == 13
    return


@app.cell
def _():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()

