import marimo

__generated_with = "0.9.19"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 2919](https://leetcode.com/problems/minimum-increment-operations-to-make-array-beautiful)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List, inf):
    class Solution2:
        def minIncrementOperations(self, nums: List[int], k: int) -> int:
            n = len(nums)
            dp = [0] * n
            for i in range(n):
                dp[i] = (dp[i - 3] if i - 3 >= 0 else 0) + max(0, k - nums[i])  # this is the max
                dp[i - 1] = min(dp[i], (dp[i - 1] if i - 1 >= 0 else inf))  # max is at i - 1
                dp[i - 2] = min(dp[i], (dp[i - 2] if i - 2 >= 0 else inf))  # max is at i - 2
            # print(dp)
            res = min(dp[-3:])
            return res
    return (Solution2,)


@app.cell
def __(List):
    class Solution:
        def minIncrementOperations(self, nums: List[int], k: int) -> int:
            dp = [0] * 3
            for v in nums:
                dp = [dp[-2], dp[-1], max(0, k - v) + min(dp)]
            res = min(dp)
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.minIncrementOperations([2,3,0,0,2], 4) == 3
    return


@app.cell
def __(sol):
    assert sol.minIncrementOperations([0,1,3,3], 5) == 2
    return


@app.cell
def __(sol):
    assert sol.minIncrementOperations([1,1,2], 1) == 0
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
