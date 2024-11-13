import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def _(mo):
    mo.md("[Problem 1013](https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum)")
    return


@app.cell
def _():
    from typing import List
    return List,


@app.cell
def _(List):
    class Solution:
        def canThreePartsEqualSum(self, arr: List[int]) -> bool:
            d, r = divmod(sum(arr), 3)
            if r != 0:
                res = False
            else:
                n = len(arr)
                lo, hi = 0, n - 1
                lft, rgt = arr[lo], arr[hi]
                while lo < hi and lft != rgt:
                    while lo < hi and lft != d:
                        lo += 1
                        lft += arr[lo]
                    while lo < hi and rgt != d:
                        hi -= 1
                        rgt += arr[hi]
                res = hi - lo > 1 and lft == rgt == d
            return res
    return Solution,


@app.cell
def _(Solution):
    sol = Solution()
    return sol,


@app.cell
def _(sol):
    assert sol.canThreePartsEqualSum([0,2,1,-6,6,-7,9,1,2,0,1])
    return


@app.cell
def _(sol):
    assert not sol.canThreePartsEqualSum([0,2,1,-6,6,7,9,-1,2,0,1])
    return


@app.cell
def _(sol):
    assert sol.canThreePartsEqualSum([3,3,6,5,-2,2,5,1,-9,4])
    return


@app.cell
def _():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()

