import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def _(mo):
    mo.md(
        r"""
        [Problem 1909](https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/)
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
        def canBeIncreasing(self, nums: List[int]) -> bool:
            used = nums[0] >= nums[1]
            prev_2 = 0
            prev_1 = 1
            for i in range(2, len(nums)):
                if nums[i] <= nums[prev_1]:
                    if used:
                        return False
                    used = True
                    if nums[i] > nums[prev_2]:
                        prev_1 = i
                else:
                    prev_2 = prev_1
                    prev_1 = i
            return True
    return Solution,


@app.cell
def _(Solution):
    sol = Solution()
    return sol,


@app.cell
def _(sol):
    assert sol.canBeIncreasing([1,2,10,5,7])
    return


@app.cell
def _(sol):
    assert not sol.canBeIncreasing([2,3,1,2])
    return


@app.cell
def _(sol):
    assert not sol.canBeIncreasing([1,1,1])
    return


@app.cell
def _(sol):
    assert sol.canBeIncreasing([105,924,32,968])
    return


@app.cell
def _(sol):
    assert not sol.canBeIncreasing([100,21,3])
    return


@app.cell
def _(sol):
    assert sol.canBeIncreasing([1,1])
    return


@app.cell
def _():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
