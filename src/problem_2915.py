import marimo

__generated_with = "0.9.23"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 2915](https://leetcode.com/problems/length-of-the-longest-subsequence-that-sums-to-target)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution2:
        def lengthOfLongestSubsequence(self, nums: List[int], t: int) -> int:
            n = len(nums)
            dp = [[-1] * (t + 1) for _ in range(n + 1)]  # dp[off][sum] = len
            for i in range(1, n + 1):
                dp[i - 1][0] = 0
                for j in range(t + 1):
                    dp[i][j] = max(dp[i][j], dp[i - 1][j])
                    if dp[i - 1][j] >= 0 and j + nums[i - 1] <= t:
                        dp[i][j + nums[i - 1]] = dp[i - 1][j] + 1
            res = dp[-1][t]
            return res
    return (Solution2,)


@app.cell
def __(List):
    class Solution:
        def lengthOfLongestSubsequence(self, nums: List[int], t: int) -> int:
            n = len(nums)
            dp = [-1] * (t + 1)  # dp[off][sum] = len
            for num in nums:
                dp[0] = 0
                for i in reversed(range(num, t + 1)):
                    nxt = dp[i - num] + 1  # check if we ever got to i - num
                    dp[i] = max(dp[i], nxt) if nxt else dp[i]
            res = dp[-1]
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.lengthOfLongestSubsequence([1,2,3,4,5], 9) == 3
    return


@app.cell
def __(sol):
    assert sol.lengthOfLongestSubsequence([4,1,3,2,1,5], 7) == 4
    return


@app.cell
def __(sol):
    assert sol.lengthOfLongestSubsequence([1,1,5,4,5], 3) == -1
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
