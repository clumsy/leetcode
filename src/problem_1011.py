import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def _(mo):
    mo.md(
        r"""
        [Problem 1011](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description)
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
        def shipWithinDays(self, weights: List[int], days: int) -> int:
            lo, hi = 0, 0
            for w in weights:
                lo = max(lo, w)
                hi += w
            while lo < hi:
                mi = lo + (hi - lo) // 2
                need, cur = 1, mi
                for w in weights:
                    if w > cur:
                        need += 1
                        cur = mi
                    cur -= w
                if need > days:
                    lo = mi + 1
                else:
                    hi = mi
            res = lo
            return res
    return Solution,


@app.cell
def _(Solution):
    sol = Solution()
    return sol,


@app.cell
def _(sol):
    assert sol.shipWithinDays([1,2,3,4,5,6,7,8,9,10], 5) == 15
    return


@app.cell
def _(sol):
    assert sol.shipWithinDays([3,2,2,4,1,4], 3) == 6
    return


@app.cell
def _(sol):
    assert sol.shipWithinDays([1,2,3,1,1], 4) == 3
    return


@app.cell
def _():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()

