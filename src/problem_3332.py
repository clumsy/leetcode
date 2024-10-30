import marimo

__generated_with = "0.9.14"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3332](https://leetcode.com/problems/maximum-points-tourist-can-earn)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def maxScore(self, n: int, k: int, ss: List[List[int]], ts: List[List[int]]) -> int:
            dp = [[0] * n for _ in range(2)]  # max score to get if finished in city c
            for i in range(k):
                for t in range(n):
                    dp[i % 2][t] = (dp[(i - 1) % 2][t] if i else 0) + ss[i][t]
                    for f in range(n):
                        dp[i % 2][t] = max(dp[i % 2][t], (dp[(i - 1) % 2][f] if i else 0) + ts[f][t])
            res = max(dp[(k - 1) % 2])
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.maxScore(2, 1, [[2,3]], [[0,2],[1,0]]) == 3
    return


@app.cell
def __(sol):
    assert sol.maxScore(3, 2, [[3,4,2],[2,1,2]], [[0,2,1],[2,0,4],[3,2,0]]) == 8
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
