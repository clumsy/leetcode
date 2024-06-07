import marimo

__generated_with = "0.6.16"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(rf"[Problem 2865](https://leetcode.com/problems/beautiful-towers-i)")
    return


@app.cell
def __():
    from typing import List
    from math import inf
    return List, inf


@app.cell
def __(List, inf):
    class Solution:
        def maximumSumOfHeights(self, m: List[int]) -> int:
            res, ma, n = 0, inf, len(m)
            for i in range(n):
                ma = cur = m[i]
                for l in reversed(range(i)):
                    cur += min(m[l], ma)
                    ma = min(ma, m[l])
                ma = m[i]
                for r in range(i + 1, n):
                    cur += min(m[r], ma)
                    ma = min(ma, m[r])
                res = max(res, cur)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maximumSumOfHeights([5,3,4,1,1]) == 13
    return


@app.cell
def __(sol):
    assert sol.maximumSumOfHeights([6,5,3,9,2,7]) == 22
    return


@app.cell
def __(sol):
    assert sol.maximumSumOfHeights([3,2,5,5,2,3]) == 18
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
