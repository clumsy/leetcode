import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2446](https://leetcode.com/problems/determine-if-two-events-have-conflict)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def haveConflict(self, e1: List[str], e2: List[str]) -> bool:
            return e1[0] <= e2[1] and e2[0] <= e1[1]
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.haveConflict(["01:15","02:00"], ["02:00","03:00"])
    return


@app.cell
def __(sol):
    assert sol.haveConflict(["01:00","02:00"], ["01:20","03:00"])
    return


@app.cell
def __(sol):
    assert not sol.haveConflict(["10:00","11:00"], ["14:00","15:00"])
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
