import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2658](https://leetcode.com/problems/maximum-number-of-fish-in-a-grid)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def findMaxFish(self, grid: List[List[int]]) -> int:
            m, n = len(grid), len(grid[0])
            def dfs(r, c):
                res = 0
                if 0 <= r < m and 0 <= c < n and grid[r][c] > 0:
                    res, grid[r][c] = grid[r][c], 0
                    res += sum(dfs(r + dr, c + dc) for dr, dc in [(1, 0), (-1, 0), (0, 1), (0, -1)])
                return res
            res = 0
            for r in range(m):
                for c in range(n):
                    res = max(res, dfs(r, c))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.findMaxFish([[0,2,1,0],[4,0,0,3],[1,0,0,4],[0,3,2,0]]) == 7
    return


@app.cell
def __(sol):
    assert sol.findMaxFish([[1,0,0,0],[0,0,0,0],[0,0,0,0],[0,0,0,1]]) == 1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
