import marimo

__generated_with = "0.6.13"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(rf"[Problem 3147](https://leetcode.com/problems/taking-maximum-energy-from-the-mystic-dungeon)")
    return


@app.cell
def __():
    from typing import List
    from math import inf
    return List, inf


@app.cell
def __(List, inf):
    class Solution:
        def maximumEnergy(self, e: List[int], k: int) -> int:
            res, n = -inf, len(e)
            for i in range(k):
                cur = 0
                for j in range(i, n, k):
                    cur = e[j] + max(0, cur)
                res = max(res, cur)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maximumEnergy([5,2,-10,-5,1], 3) == 3
    return


@app.cell
def __(sol):
    assert sol.maximumEnergy([-2,-3,-1], 2) == -1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
