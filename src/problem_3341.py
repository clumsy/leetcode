import marimo

__generated_with = "0.9.17"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3341](https://leetcode.com/problems/find-minimum-time-to-reach-last-room-i)""")
    return


@app.cell
def __():
    from typing import List
    from heapq import heappop, heappush
    return List, heappop, heappush


@app.cell
def __(List, heappop, heappush):
    class Solution:
        def minTimeToReach(self, mt: List[List[int]]) -> int:
            n, m = len(mt), len(mt[0])
            q, dp = [(0, 0, 0)], [[-1] * m for _ in range(n)]
            while q:
                t, r, c = heappop(q)
                if dp[r][c] >= 0:
                    continue
                dp[r][c] = t
                if r == n - 1 and c == m - 1:
                    res = t
                    break
                for dr, dc in ((1, 0), (-1, 0), (0, 1), (0, -1)):
                    r_, c_ = r + dr, c + dc
                    if 0 <= r_ < n and 0 <= c_ < m and dp[r_][c_] == -1:
                        heappush(q, (max(t, mt[r_][c_]) + 1, r_, c_))
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.minTimeToReach([[0,4],[4,4]]) == 6
    return


@app.cell
def __(sol):
    assert sol.minTimeToReach([[0,0,0],[0,0,0]]) == 3
    return


@app.cell
def __(sol):
    assert sol.minTimeToReach([[0,1],[1,2]]) == 3
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
