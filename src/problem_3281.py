import marimo

__generated_with = "0.9.14"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3281](https://leetcode.com/problems/maximize-score-of-numbers-in-ranges)""")
    return


@app.cell
def __():
    from typing import List
    from math import inf
    return List, inf


@app.cell
def __(List, inf):
    class Solution:
        def maxPossibleScore(self, s: List[int], d: int) -> int:
            s.sort()
            n = len(s)
            lo, hi = 0, (s[-1] + d - s[0]) // (n - 1)
            while lo < hi:
                x = hi - (hi - lo) // 2
                res, cur = True, -inf
                for i in s:
                    cur += x
                    if cur > i + d:
                        res = False
                        break
                    cur = max(cur, i)
                if res:
                    lo = x
                else:
                    hi = x - 1
            res = lo
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.maxPossibleScore([6,0,3], 2) == 4
    return


@app.cell
def __(sol):
    assert sol.maxPossibleScore([2,6,13,13], 5) == 5
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
