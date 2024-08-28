import marimo

__generated_with = "0.8.15"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3286](https://leetcode.com/problems/find-a-safe-walk-through-a-grid)""")
    return


@app.cell
def __():
    from typing import List
    from heapq import heappop, heappush
    return List, heappop, heappush


@app.cell
def __(List, heappop, heappush):
    class Solution:
        def findSafeWalk(self, g: List[List[int]], h: int) -> bool:
            m, n = len(g), len(g[0])
            q, seen = [(-h + g[0][0], 0, 0)], {(0, 0)}
            res = False
            while q:
                h, x, y = heappop(q)
                if x == m - 1 and y == n - 1:
                    res = True
                    break
                for dx, dy in ((-1, 0), (0, -1), (1, 0), (0, 1)):
                    x_, y_ = x + dx, y + dy
                    if 0 <= x_ < m and 0 <= y_ < n and h + g[x_][y_] < 0 and (x_, y_) not in seen:
                        seen.add((x_, y_))
                        heappush(q, (h + g[x_][y_], x_, y_))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.findSafeWalk([[0,1,0,0,0],[0,1,0,1,0],[0,0,0,1,0]], 1)
    return


@app.cell
def __(sol):
    assert not sol.findSafeWalk([[0,1,1,0,0,0],[1,0,1,0,0,0],[0,1,1,1,0,1],[0,0,1,0,1,0]], 3)
    return


@app.cell
def __(sol):
    assert sol.findSafeWalk([[1,1,1],[1,0,1],[1,1,1]], 5)
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
