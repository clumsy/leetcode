import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def _(mo):
    mo.md("[Problem 1913](https://leetcode.com/problems/maximum-product-difference-between-two-pairs)")
    return


@app.cell
def _():
    from typing import List
    return List,


@app.cell
def _(List):
    class Solution2:
        def maxProductDifference(self, nums: List[int]) -> int:
            nums.sort()
            res = nums[-1] * nums[-2] - nums[1]*nums[0]
            return res
    return Solution2,


@app.cell
def _(List):
    class Solution:
        def maxProductDifference(self, nums: List[int]) -> int:
            ma1 = ma2 = 0
            mi1 = mi2 = 10001
            for i in nums:
                if i >= ma1:
                    ma1, ma2 = i, ma1
                elif i > ma2:
                    ma2 = i
                if i <= mi1:
                    mi1, mi2 = i, mi1
                elif i < mi2:
                    mi2 = i
            res = ma1*ma2 - mi1*mi2
            return res
    return Solution,


@app.cell
def _(Solution):
    sol = Solution()
    return sol,


@app.cell
def _(sol):
    assert sol.maxProductDifference([5,6,2,7,4]) == 34
    return


@app.cell
def _(sol):
    assert sol.maxProductDifference([4,2,5,9,7,4,8]) == 64
    return


@app.cell
def _():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
