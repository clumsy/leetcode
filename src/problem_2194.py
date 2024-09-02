import marimo

__generated_with = "0.8.15"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2194](https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet)""")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def cellsInRange(self, s: str) -> List[str]:
            (c1, r1), (c2, r2) = s.split(":")
            res = [f"{chr(c)}{chr(r)}" for c in range(ord(c1), ord(c2) + 1) for r in range(ord(r1), ord(r2) + 1)]
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.cellsInRange("K1:L2") == ["K1","K2","L1","L2"]
    return


@app.cell
def __(sol):
    assert sol.cellsInRange("A1:F1") == ["A1","B1","C1","D1","E1","F1"]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
