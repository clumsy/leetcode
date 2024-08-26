import marimo

__generated_with = "0.8.15"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3285](https://leetcode.com/problems/find-indices-of-stable-mountains)""")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def stableMountains(self, h: List[int], t: int) -> List[int]:
            res = [i for i in range(1, len(h)) if h[i - 1] > t]
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.stableMountains([1,2,3,4,5], 2) == [3,4]
    return


@app.cell
def __(sol):
    assert sol.stableMountains([10,1,10,1,10], 3) == [1,3]
    return


@app.cell
def __(sol):
    assert sol.stableMountains([10,1,10,1,10], 10) == []
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
