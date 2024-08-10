import marimo

__generated_with = "0.7.19"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3207](https://leetcode.com/problems/maximum-points-after-enemy-battles)""")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def maximumPoints(self, ee: List[int], ce: int) -> int:
            s = mi = 0
            for i, e in enumerate(ee):
                if e < ee[mi]:
                    mi = i
                s += e
            res = (s - ee[mi] + ce) // ee[mi] if ce >= ee[mi] else 0
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maximumPoints([3,2,2], 2) == 3
    return


@app.cell
def __(sol):
    assert sol.maximumPoints([2], 10) == 5
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
