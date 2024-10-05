import marimo

__generated_with = "0.9.1"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3296](https://leetcode.com/problems/minimum-number-of-seconds-to-make-mountain-height-zero)""")
    return


@app.cell
def __():
    from typing import List
    from math import floor, sqrt
    return List, floor, sqrt


@app.cell
def __(List, floor, sqrt):
    class Solution2:
        def minNumberOfSeconds(self, mh: int, wt: List[int]) -> int:
            # w * (1 + h) * h // 2 = s
            # -2s + wh + wh^2 = 0
            # -2s/w + h + h^2 = 0
            # D2 = 1 - 4(-2s/w)
            # h = (-1 + D)/2
            def works(s):
                ch = 0
                for i, w in enumerate(wt):
                    h = floor((sqrt(1 + 8*s/w) - 1) / 2)
                    ch += h
                    if ch >= mh:
                        return True
                return False
            lo, hi = 0, min(wt) * (((1 + mh) * mh) // 2)
            while lo < hi:
                mi = lo + (hi - lo) // 2
                if works(mi):
                    hi = mi
                else:
                    lo = mi + 1
            res = lo
            return res
    return (Solution2,)


@app.cell
def __():
    from heapq import heappop, heappush, heapify
    return heapify, heappop, heappush


@app.cell
def __(List, heapify, heappop, heappush):
    class Solution:
        def minNumberOfSeconds(self, mh: int, wt: List[int]) -> int:
            h = [(t, 1, t) for t in wt]
            heapify(h)
            for _ in range(mh):
                res, lvl, t = heappop(h)
                heappush(h, (res + (lvl + 1) * t, lvl + 1, t))
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.minNumberOfSeconds(4, [2,1,1]) == 3
    return


@app.cell
def __(sol):
    assert sol.minNumberOfSeconds(10, [3,2,2,4]) == 12
    return


@app.cell
def __(sol):
    assert sol.minNumberOfSeconds(5, [1]) == 15
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
