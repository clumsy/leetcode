import marimo

__generated_with = "0.6.13"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(rf"[Problem 3122](https://leetcode.com/problems/minimum-number-of-operations-to-satisfy-conditions)")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(Counter, List):
    class Solution:
        def minimumOperations(self, g: List[List[int]]) -> int:
            dp = [[0] * 10 for _ in range(2)]
            rs, cs = len(g), len(g[0])
            for c in range(cs):
                cnt = Counter(g[r][c] for r in range(rs))
                for k in range(10):
                    dp[(c + 1) % 2][k] = min(dp[c % 2][i] for i in range(10) if i != k) + (rs - cnt[k])
            res = min(dp[cs % 2])
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumOperations([[1,0,2],[1,0,2]]) == 0
    return


@app.cell
def __(sol):
    assert sol.minimumOperations([[1,1,1],[0,0,0]]) == 3
    return


@app.cell
def __(sol):
    assert sol.minimumOperations([[1],[2],[3]]) == 2
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
