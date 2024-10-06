import marimo

__generated_with = "0.9.1"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2319](https://leetcode.com/problems/check-if-matrix-is-x-matrix)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def checkXMatrix(self, grid: List[List[int]]) -> bool:
            rows, cols = len(grid), len(grid[0])
            for r in range(rows):
                for c in range(cols):
                    if r == c or r + c == cols - 1:
                        if grid[r][c] == 0:
                            return False
                    else:
                        if grid[r][c] != 0:
                            return False
            return True
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.checkXMatrix([[2,0,0,1],[0,3,1,0],[0,5,2,0],[4,0,0,2]])
    return


@app.cell
def __(sol):
    assert not sol.checkXMatrix([[5,7,0],[0,3,1],[0,5,0]])
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
