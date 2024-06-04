import marimo

__generated_with = "0.6.13"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(rf"[Problem 3169](https://leetcode.com/problems/count-days-without-meetings)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def countDays(self, d: int, m: List[List[int]]) -> int:
            m.sort()
            res = p = 0
            for s, e in m:
                res += max(0, s - p - 1)
                p = max(p, e)
            res += d - p
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countDays(10, [[5,7],[1,3],[9,10]]) == 2
    return


@app.cell
def __(sol):
    assert sol.countDays(5, [[2,4],[1,3]]) == 1
    return


@app.cell
def __(sol):
    assert sol.countDays(6, [[1,6]]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
