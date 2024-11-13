import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def _(mo):
    mo.md("[Problem 1030](https://leetcode.com/problems/matrix-cells-in-distance-order)")
    return


@app.cell
def _():
    from typing import List
    return List,


@app.cell
def _(List):
    class Solution:
        def allCellsDistOrder(self, rows: int, cols: int, r: int, c: int) -> List[List[int]]:
            res = [[r, c]]
            d = max(r + c, r + cols - c, rows - r + c, rows - r + cols - c)
            for i in range(1, d + 1):
                for j in range(i):
                    if 0 <= r - (i - j) < rows and 0 <= c + j < cols:
                        res.append([r - (i - j), c + j])
                    if 0 <= r + j < rows and 0 <= c + (i - j) < cols:
                        res.append([r + j, c + (i - j)])
                    if 0 <= r + (i - j) < rows and 0 <= c - j < cols:
                        res.append([r + (i - j), c - j])
                    if 0 <= r - j < rows and 0 <= c - (i - j) < cols:
                        res.append([r - j, c - (i - j)])
            return res
    return Solution,


@app.cell
def _(Solution):
    sol = Solution()
    return sol,


@app.cell
def _(sol):
    assert sol.allCellsDistOrder(1,2,0,0) == [[0,0],[0,1]]
    return


@app.cell
def _(sol):
    assert sol.allCellsDistOrder(2,2,0,1) == [[0,1],[1,1],[0,0],[1,0]]
    return


@app.cell
def _(sol):
    assert sol.allCellsDistOrder(2,3,1,2) == [[1,2],[0,2],[1,1],[1,0],[0,1],[0,0]]
    return


@app.cell
def _():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()

