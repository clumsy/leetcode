import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2140](https://leetcode.com/problems/solving-questions-with-brainpower)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def mostPoints(self, q: List[List[int]]) -> int:
            res, n = 0, len(q)
            dp = [0] * n
            for i in reversed(range(n)):
                p, b = q[i]
                dp[i] = max(dp[i + 1] if i + 1 < n else 0, p + (dp[i + b + 1] if i + b + 1 < n else 0))
                res = max(res, dp[i])
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.mostPoints([[3,2],[4,3],[4,4],[2,5]]) == 5
    return


@app.cell
def __(sol):
    assert sol.mostPoints([[1,1],[2,2],[3,3],[4,4],[5,5]]) == 7
    return


@app.cell
def __(sol):
    assert sol.mostPoints([[1,1],[2,2],[3,3],[4,4],[5,5]]) == 7
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
