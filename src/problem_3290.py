import marimo

__generated_with = "0.8.15"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3290](https://leetcode.com/problems/maximum-multiplication-score)""")
    return


@app.cell
def __():
    from typing import List
    from math import inf
    return List, inf


@app.cell
def __(List, inf):
    class Solution2:
        def maxScore(self, a: List[int], b: List[int]) -> int:
            n = len(b)
            m, lft = a[0] * b[0], [a[0] * b[0] + a[1] * b[1]] * n
            for i1 in range(1, n - 2):
                lft[i1] = max(lft[i1 - 1], m + a[1] * b[i1])
                m = max(m, a[0] * b[i1])
            m, rgt = a[-1] * b[-1], [a[-2] * b[-2] + a[-1] * b[-1]] * n
            for i2 in reversed(range(2, n - 1)):
                rgt[i2] = max(rgt[i2 + 1], m + a[-2] * b[i2])
                m = max(m, a[-1] * b[i2])
            res = -inf
            for i1 in range(1, n - 2):
                res = max(res, lft[i1] + rgt[i1 + 1])
            return res
    return Solution2,


@app.cell
def __(List, inf):
    class Solution:
        def maxScore(self, a: List[int], b: List[int]) -> int:
            dp = [-inf] * 4
            for i in b:
                dp[3] = max(dp[3], dp[2] + i * a[3])
                dp[2] = max(dp[2], dp[1] + i * a[2])
                dp[1] = max(dp[1], dp[0] + i * a[1])
                dp[0] = max(dp[0], i * a[0])
            res = dp[3]
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maxScore([3,2,5,6], [2,-6,4,-5,-3,2,-7]) == 26
    return


@app.cell
def __(sol):
    assert sol.maxScore([-1,4,5,-2], [-5,-1,-3,-2,-4]) == -1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
