import marimo

__generated_with = "0.7.5"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"[Problem 3206](https://leetcode.com/problems/alternating-groups-i)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def numberOfAlternatingGroups(self, c: List[int]) -> int:
            n = len(c)
            res = sum(c[i] != c[(i - 1) % n] and c[i] != c[(i + 1) % n] for i in range(n))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.numberOfAlternatingGroups([1,1,1]) == 0
    return


@app.cell
def __(sol):
    assert sol.numberOfAlternatingGroups([0,1,0,0,1]) == 3
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
