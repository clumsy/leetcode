import marimo

__generated_with = "0.9.20"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2500](https://leetcode.com/problems/delete-greatest-value-in-each-row)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def deleteGreatestValue(self, grid: List[List[int]]) -> int:
            for r in grid:
                r.sort()
            res = sum(max(vals) for vals in zip(*grid))
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.deleteGreatestValue([[1,2,4],[3,3,1]]) == 8
    return


@app.cell
def __(sol):
    assert sol.deleteGreatestValue([[10]]) == 10
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
