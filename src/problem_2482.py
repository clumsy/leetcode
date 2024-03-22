import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2482](https://leetcode.com/problems/difference-between-ones-and-zeros-in-row-and-column)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def onesMinusZeros(self, grid: List[List[int]]) -> List[List[int]]:
            m, n = len(grid), len(grid[0])
            ones_row, ones_col = [0] * m, [0] * n
            for r in range(m):
                for c in range(n):
                    ones_row[r] += grid[r][c]
                    ones_col[c] += grid[r][c]
            for r in range(m):
                for c in range(n):
                    # ones_row[r] + ones_col[c] - (m - ones_row[r]) - (n - ones_col[c])
                    grid[r][c] = 2 * ones_row[r] + 2 * ones_col[c] - m - n
            return grid
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.onesMinusZeros([[0,1,1],[1,0,1],[0,0,1]]) == [[0,0,4],[0,0,4],[-2,-2,2]]
    return


@app.cell
def __(sol):
    assert sol.onesMinusZeros([[1,1,1],[1,1,1]]) == [[5,5,5],[5,5,5]]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
