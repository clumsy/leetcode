import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def _(mo):
    mo.md("[Problem 1004](https://leetcode.com/problems/max-consecutive-ones-iii)")
    return


@app.cell
def _():
    from typing import List
    return List,


@app.cell
def _(List):
    class Solution:
        def longestOnes(self, nums: List[int], k: int) -> int:
            n = len(nums)
            s = e = 0
            while e < n:
                k -= nums[e] != 1  # how much k remains if e is the end
                e += 1
                if k < 0:
                    k += nums[s] != 1
                    s += 1  # make s follow e at the distance equal to longest subarray with less 0s than k
            return e - s
    return Solution,


@app.cell
def _(Solution):
    sol = Solution()
    return sol,


@app.cell
def _(sol):
    assert sol.longestOnes([1,1,1,0,0,0,1,1,1,1,0], 2) == 6
    return


@app.cell
def _(sol):
    assert sol.longestOnes([0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], 3) == 10
    return


@app.cell
def _():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()

