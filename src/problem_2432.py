import marimo

__generated_with = "0.3.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2432](https://leetcode.com/problems/the-employee-that-worked-on-the-longest-task)")
    return


@app.cell
def __():
    from typing import List
    from math import inf
    return List, inf


@app.cell
def __(List, inf):
    class Solution:
        def hardestWorker(self, n: int, logs: List[List[int]]) -> int:
            res, ma, prv = inf, 0, 0
            for i, l in logs:
                d = l - prv
                if d >= ma:
                    res = min(res, i) if d == ma else i
                    ma = d
                prv = l
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.hardestWorker(10, [[0,3],[2,5],[0,9],[1,15]]) == 1
    return


@app.cell
def __(sol):
    assert sol.hardestWorker(26, [[1,1],[3,7],[2,12],[7,17]]) == 3
    return


@app.cell
def __(sol):
    assert sol.hardestWorker(2, [[0,10],[1,20]]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
