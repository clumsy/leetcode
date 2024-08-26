import marimo

__generated_with = "0.8.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2187](https://leetcode.com/problems/minimum-time-to-complete-trips)""")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def minimumTime(self, time: List[int], totalTrips: int) -> int:
            lo, hi = 1, min(time) * totalTrips
            while lo < hi:
                mi = lo + (hi - lo) // 2
                cur = sum(mi // t for t in time)
                if cur >= totalTrips:
                    hi = mi
                else:
                    lo = mi + 1
            res = lo
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumTime([1,2,3], 5) == 3
    return


@app.cell
def __(sol):
    assert sol.minimumTime([2], 1) == 2
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
