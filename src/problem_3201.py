import marimo

__generated_with = "0.6.24"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(rf"[Problem 3201](https://leetcode.com/problems/find-the-maximum-length-of-valid-subsequence-i)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def maximumLength(self, nums: List[int]) -> int:
            # length of subseq that has 0 even and 1 odd sum that ends with an 0 even or 1 odd number
            dp = [[0] * 2 for _ in range(2)]
            for i in nums:
                if i & 1 == 0:
                    dp[0][0] += 1
                    dp[1][0] = 1 + dp[1][1]
                else:
                    dp[0][1] += 1
                    dp[1][1] = 1 + dp[1][0]
            res = max(max(d) for d in dp)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maximumLength([1,2,3,4]) == 4
    return


@app.cell
def __(sol):
    assert sol.maximumLength([1,2,1,1,2,1,2]) == 6
    return


@app.cell
def __(sol):
    assert sol.maximumLength([1,3]) == 2
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
