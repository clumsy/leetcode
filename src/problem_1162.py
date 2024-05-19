import marimo

__generated_with = "0.5.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 1162](https://leetcode.com/problems/as-far-from-land-as-possible)")
    return


@app.cell
def __():
    from typing import List
    from collections import deque
    return List, deque


@app.cell
def __(List, deque):
    class Solution:
        def maxDistance(self, g: List[List[int]]) -> int:
            n = len(g)
            q = deque([(r, c) for r in range(n) for c in range(n) if g[r][c] > 0])
            res = 0
            while q:
                for _ in range(len(q)):
                    r, c = q.popleft()
                    for (dr, dc) in ((1, 0), (-1, 0), (0, 1), (0, -1)):
                        r_, c_ = r + dr, c + dc
                        if 0 <= r_ < n and 0 <= c_ < n and g[r_][c_] == 0:
                            res = g[r_][c_] = g[r][c] + 1
                            q.append((r_, c_))
            res -= 1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maxDistance([[1,0,1],[0,0,0],[1,0,1]]) == 2
    return


@app.cell
def __(sol):
    assert sol.maxDistance([[1,0,0],[0,0,0],[0,0,0]]) == 4
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
