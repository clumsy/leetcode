import marimo

__generated_with = "0.9.11"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 2812](https://leetcode.com/problems/find-the-safest-path-in-a-grid)""")
    return


@app.cell
def __():
    from typing import List
    from heapq import heappush, heappop
    return List, heappop, heappush


@app.cell
def __(List, heappop, heappush):
    class Solution:
        def maximumSafenessFactor(self, g: List[List[int]]) -> int:
            n, q = len(g), []
            vis = [[False] * n for _ in range(n)]
            for r in range(n):
                for c in range(n):
                    if g[r][c] == 1:
                        q.append((0, r, c))
            while q:
                d, r, c = heappop(q)
                if not vis[r][c]:
                    vis[r][c] = True
                    g[r][c] = d
                    for dr, dc in ((0, 1), (0, -1), (-1, 0), (1, 0)):
                        r_, c_ = r + dr, c + dc
                        if 0 <= r_ < n and 0 <= c_ < n and not vis[r_][c_] and g[r_][c_] == 0:
                            heappush(q, (d + 1, r_, c_))
            q = [(-g[0][0], 0, 0)]
            vis = [[False] * n for _ in range(n)]
            while q:
                d, r, c = heappop(q)
                if not vis[r][c]:
                    vis[r][c] = True
                    d = -min(-d, g[r][c])
                    if r == n - 1 and c == n - 1:
                        res = -d
                        break
                    for dr, dc in ((0, 1), (0, -1), (-1, 0), (1, 0)):
                        r_, c_ = r + dr, c + dc
                        if 0 <= r_ < n and 0 <= c_ < n and not vis[r_][c_]:
                            heappush(q, (d, r_, c_))
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.maximumSafenessFactor([[1,0,0],[0,0,0],[0,0,1]]) == 0
    return


@app.cell
def __(sol):
    assert sol.maximumSafenessFactor([[0,0,1],[0,0,0],[0,0,0]]) == 2
    return


@app.cell
def __(sol):
    assert sol.maximumSafenessFactor([[0,0,0,1],[0,0,0,0],[0,0,0,0],[1,0,0,0]]) == 2
    return


@app.cell
def __():
    return


if __name__ == "__main__":
    app.run()
