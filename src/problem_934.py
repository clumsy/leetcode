import marimo

__generated_with = "0.5.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 934](https://leetcode.com/problems/shortest-bridge)")
    return


@app.cell
def __():
    from typing import List
    from collections import deque
    return List, deque


@app.cell
def __(List, deque):
    class Solution:
        def shortestBridge(self, grid: List[List[int]]) -> int:
            q = deque()
            rows = cols = len(grid)
            def dfs(r, c):
                if r < 0 or r >= rows or c < 0 or c >= cols or grid[r][c] != 1:
                    return
                grid[r][c] = 0
                q.append((r, c))
                dfs(r + 1, c)
                dfs(r - 1, c)
                dfs(r, c - 1)
                dfs(r, c + 1)

            marked = False
            for r in range(rows):
                if marked:
                    break
                for c in range(cols):
                    if grid[r][c] == 1:
                        dfs(r, c)
                        marked = True
                        break

            res, done = -2, False
            while not done:
                for _ in range(len(q)):
                    r, c = q.popleft()
                    if r < 0 or r >= rows or c < 0 or c >= cols:
                        continue
                    if grid[r][c] == 1:
                        done = True
                        break
                    if grid[r][c] == 0:
                        grid[r][c] += 2
                        q.append((r + 1, c))
                        q.append((r - 1, c))
                        q.append((r, c + 1))
                        q.append((r, c - 1))
                res += 1

            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.shortestBridge([[0,1],[1,0]]) == 1
    return


@app.cell
def __(sol):
    assert sol.shortestBridge([[0,1,0],[0,0,0],[0,0,1]]) == 2
    return


@app.cell
def __(sol):
    assert sol.shortestBridge([[1,1,1,1,1],[1,0,0,0,1],[1,0,1,0,1],[1,0,0,0,1],[1,1,1,1,1]]) == 1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
