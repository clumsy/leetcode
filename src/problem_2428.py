import marimo

__generated_with = "0.3.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2428](https://leetcode.com/problems/maximum-sum-of-an-hourglass)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def maxSum(self, grid: List[List[int]]) -> int:
            res, rows, cols = 0, len(grid), len(grid[0])
            for r in range(rows - 2):
                for c in range(cols - 2):
                    cur = (
                        grid[r][c] + grid[r][c + 1] + grid[r][c + 2] + 
                            grid[r + 1][c + 1] +
                        grid[r + 2][c] + grid[r + 2][c + 1] + grid[r + 2][c + 2]
                    )
                    res = max(res, cur)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maxSum([[6,2,1,3],[4,2,1,5],[9,2,8,7],[4,1,2,9]]) == 30
    return


@app.cell
def __(sol):
    assert sol.maxSum([[1,2,3],[4,5,6],[7,8,9]]) == 35
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
