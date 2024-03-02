import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2418](https://leetcode.com/problems/sort-the-people)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
            res = [names[i] for i in sorted(range(len(names)), key=heights.__getitem__, reverse=True)]
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.sortPeople(["Mary","John","Emma"], [180,165,170]) == ["Mary","Emma","John"]
    return


@app.cell
def __(sol):
    assert sol.sortPeople(["Alice","Bob","Bob"], [155,185,150]) == ["Bob","Alice","Bob"]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
