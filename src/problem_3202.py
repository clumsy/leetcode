import marimo

__generated_with = "0.6.26"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(rf"[Problem 3202](https://leetcode.com/problems/find-the-maximum-length-of-valid-subsequence-ii)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def maximumLength(self, nums: List[int], k: int) -> int:
            dp = [[0] * k for _ in range(k)]
            for i in nums:
                r = i % k
                for j in range(k):
                    dp[j][r] = 1 + dp[j][(j - r) % k]
            res = max(max(d) for d in dp)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maximumLength([1,2,3,4,5], 2) == 5
    return


@app.cell
def __(sol):
    assert sol.maximumLength([1,4,2,3,1,4], 3) == 4
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
