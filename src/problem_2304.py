import marimo

__generated_with = "0.8.22"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2304](https://leetcode.com/problems/minimum-path-cost-in-a-grid)""")
    return


@app.cell
def __():
    from typing import List
    from math import inf
    return List, inf


@app.cell
def __(List, inf):
    class Solution:
        def minPathCost(self, grid: List[List[int]], moveCost: List[List[int]]) -> int:
            m, n = len(grid), len(grid[0])
            dp = [[inf for _ in range(n)] for _ in range(m)]
            dp[-1] = grid[-1][::]
            for r in range(m - 1, 0, -1):
                for c in range(n):
                    for k in range(n):
                        dp[r - 1][k] = min(dp[r - 1][k], dp[r][c] + grid[r - 1][k] + moveCost[grid[r - 1][k]][c])
            res = min(dp[0])
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.minPathCost([[5,3],[4,0],[2,1]], [[9,8],[1,5],[10,12],[18,6],[2,4],[14,3]]) == 17
    return


@app.cell
def __(sol):
    assert sol.minPathCost([[5,1,2],[4,0,3]], [[12,10,15],[20,23,8],[21,7,1],[8,1,13],[9,10,25],[5,3,2]]) == 6
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
