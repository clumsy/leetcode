import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 1926](https://leetcode.com/problems/nearest-exit-from-entrance-in-maze)")
    return


@app.cell
def __():
    from typing import List
    from heapq import heappush, heappop
    return List, heappop, heappush


@app.cell
def __(List, heappop, heappush):
    class Solution:
        def nearestExit(self, maze: List[List[str]], entrance: List[int]) -> int:
            m, n = len(maze), len(maze[0])
            res, found = -1, False
            def dist(r, c, i):
                return abs(entrance[0] - r) + abs(entrance[1] - c), i, (r, c)
            q = []
            for r in range(m):
                if maze[r][0] == "." and [r, 0] != entrance:
                    maze[r][0] = "x"
                    heappush(q, dist(r, 0, 0))
                if maze[r][n - 1] == "." and [r, n - 1] != entrance:
                    maze[r][n - 1] = "x"
                    heappush(q, dist(r, n - 1, 0))
            for c in range(n - 1):
                if maze[0][c] == "." and [0, c] != entrance:
                    maze[0][c] = "x"
                    heappush(q, dist(0, c, 0))
                if maze[m - 1][c] == "." and [m - 1, c] != entrance:
                    maze[m - 1][c] = "x"
                    heappush(q, dist(m - 1, c, 0))
            while q:
                _, i, (r, c) = heappop(q)
                if [r, c] == entrance:
                    res = i
                    break
                for dr, dc in [(1, 0), (-1, 0), (0, 1), (0, -1)]:
                    if m > r + dr >= 0 and n > c + dc >= 0 and maze[r + dr][c + dc] == ".":
                        maze[r + dr][c + dc] = "x"
                        heappush(q, dist(r + dr, c + dc, i + 1))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.nearestExit([["+","+",".","+"],[".",".",".","+"],["+","+","+","."]], [1,2]) == 1
    return


@app.cell
def __(sol):
    assert sol.nearestExit([["+","+","+"],[".",".","."],["+","+","+"]], [1,0]) == 2
    return


@app.cell
def __(sol):
    assert sol.nearestExit([[".","+"]], [0,0]) == -1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
