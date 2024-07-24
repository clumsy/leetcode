import marimo

__generated_with = "0.7.17"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3242](https://leetcode.com/problems/design-neighbor-sum-service)""")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class neighborSum:

        def __init__(self, g: List[List[int]]):
            self.a, self.d = {}, {}
            for r in range(len(g)):
                for c in range(len(g[0])):
                    for dr, dc in ((0, 1), (0, -1), (1, 0), (-1, 0)):
                        if 0 <= r + dr < len(g) and 0 <= c + dc < len(g[0]):
                            self.a[g[r][c]] = self.a.get(g[r][c], 0) + g[r + dr][c + dc]
                    for dr, dc in ((1, 1), (-1, -1), (1, -1), (-1, 1)):
                        if 0 <= r + dr < len(g) and 0 <= c + dc < len(g[0]):
                            self.d[g[r][c]] = self.d.get(g[r][c], 0) + g[r + dr][c + dc]

        def adjacentSum(self, v: int) -> int:
            return self.a[v]

        def diagonalSum(self, v: int) -> int:
            return self.d[v]
    return neighborSum,


@app.cell
def __(neighborSum):
    sol1 = neighborSum([[0, 1, 2], [3, 4, 5], [6, 7, 8]])
    assert sol1.adjacentSum(1) == 6
    assert sol1.adjacentSum(4) == 16
    assert sol1.diagonalSum(4) == 16
    assert sol1.diagonalSum(8) == 4
    return sol1,


@app.cell
def __(neighborSum):
    sol2 = neighborSum([[1, 2, 0, 3], [4, 7, 15, 6], [8, 9, 10, 11], [12, 13, 14, 5]])
    assert sol2.adjacentSum(15) == 23
    assert sol2.diagonalSum(9) == 45
    return sol2,


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
