import marimo

__generated_with = "0.9.14"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3342](https://leetcode.com/problems/find-minimum-time-to-reach-last-room-ii)""")
    return


@app.cell
def __():
    from typing import List
    from heapq import heappop, heappush
    return List, heappop, heappush


@app.cell
def __(List, heappop, heappush):
    class Solution2:
        def minTimeToReach(self, mt: List[List[int]]) -> int:
            vis, n, m = set(), len(mt), len(mt[0])
            q = [(0, 0, 0, 2)]
            while q:
                t, r, c, d = heappop(q)
                if r == n - 1 and c == m - 1:
                    res = t
                    break
                if (r, c) not in vis:
                    vis.add((r, c))
                    for dr, dc in ((-1, 0), (1, 0), (0, 1), (0, -1)):
                        r_, c_ = r + dr, c + dc
                        if 0 <= r_ < n and 0 <= c_ < m and (r_, c_) not in vis:
                            heappush(q, (max(t, mt[r_][c_]) + 3 - d, r_, c_, 3 - d))
            return res
    return (Solution2,)


@app.cell
def __():
    from math import inf
    return (inf,)


@app.cell
def __(List, heappop, heappush, inf):
    class Solution:
        def minTimeToReach(self, mt: List[List[int]]) -> int:
            n, m = len(mt), len(mt[0])
            dp = [[inf] * m for _ in range(n)]
            q = [(0, 0, 0)]
            while q:
                t, r, c = heappop(q)
                if t >= dp[r][c]:
                    continue
                dp[r][c] = t
                if r == n - 1 and c == m - 1:
                    break
                for dr, dc in ((-1, 0), (1, 0), (0, 1), (0, -1)):
                    r_, c_ = r + dr, c + dc
                    if 0 <= r_ < n and 0 <= c_ < m and dp[r_][c_] == inf:
                        d = (r_ + c_) % 2 + 1
                        heappush(q, (max(t, mt[r_][c_]) + 3 - d, r_, c_))
            res = dp[n - 1][m - 1]
            return res

    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.minTimeToReach([[0,4],[4,4]]) == 7
    return


@app.cell
def __(sol):
    assert sol.minTimeToReach([[0,0,0,0],[0,0,0,0]]) == 6
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
