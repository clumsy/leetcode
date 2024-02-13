import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def _(mo):
    mo.md(
        r"""
        [Problem 1905](https://leetcode.com/problems/count-sub-islands/description)
        """
    )
    return


@app.cell
def _():
    from typing import List
    return List,


@app.cell
def _(List):
    class Solution:
        def countSubIslands(self, grid1: List[List[int]], grid2: List[List[int]]) -> int:
            rows, cols = len(grid1), len(grid1[0])
            def dfs(r, c):
                if r < 0 or r >= rows or c < 0 or c >= cols or grid2[r][c] == 0:
                    return True
                res = grid2[r][c] == grid1[r][c]
                grid2[r][c] = 0
                res = dfs(r + 1, c) and res
                res = dfs(r - 1, c) and res
                res = dfs(r, c + 1) and res
                res = dfs(r, c - 1) and res
                return res

            res = 0
            for r in range(rows):
                for c in range(cols):
                    if grid2[r][c] > 0:
                        res += dfs(r, c)
            return res
    return Solution,


@app.cell
def _(Solution):
    sol = Solution()
    return sol,


@app.cell
def _(sol):
    assert sol.countSubIslands([[1,1,1,0,0],[0,1,1,1,1],[0,0,0,0,0],[1,0,0,0,0],[1,1,0,1,1]], [[1,1,1,0,0],[0,0,1,1,1],[0,1,0,0,0],[1,0,1,1,0],[0,1,0,1,0]]) == 3
    return


@app.cell
def _(sol):
    assert sol.countSubIslands([[1,0,1,0,1],[1,1,1,1,1],[0,0,0,0,0],[1,1,1,1,1],[1,0,1,0,1]], [[0,0,0,0,0],[1,1,1,1,1],[0,1,0,1,0],[0,1,0,1,0],[1,0,0,0,1]]) == 2
    return


@app.cell
def _():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()

