import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def _(mo):
    mo.md("[Problem 1035](https://leetcode.com/problems/uncrossed-lines)")
    return


@app.cell
def _():
    from typing import List
    return List,


@app.cell
def _(List):
    class Solution2:
        def maxUncrossedLines(self, nums1: List[int], nums2: List[int]) -> int:
            n1, n2 = len(nums1), len(nums2)
            dp = [[0] * (n2 + 1) for _ in range(n1 + 1)]
            for i1 in range(n1):
                for i2 in range(n2):
                    dp[i1 + 1][i2 + 1] = (
                        dp[i1][i2] + 1 if nums1[i1] == nums2[i2] else
                        max(dp[i1][i2 + 1], dp[i1 + 1][i2])
                    )
            res = dp[-1][-1]
            return res
    return Solution2,


@app.cell
def _(List):
    class Solution:
        def maxUncrossedLines(self, nums1: List[int], nums2: List[int]) -> int:
            n1, n2 = len(nums1), len(nums2)
            dp = [0] * (n2 + 1)
            for i1 in range(n1):
                for i2 in range(n2)[::-1]:
                    dp[i2 + 1] = dp[i2] + 1 if nums1[i1] == nums2[i2] else dp[i2 + 1]
                for i2 in range(n2):
                    dp[i2 + 1] = max(dp[i2 + 1], dp[i2])
            res = dp[-1]
            return res
    return Solution,


@app.cell
def _(Solution):
    sol = Solution()
    return sol,


@app.cell
def _(sol):
    assert sol.maxUncrossedLines([1,4,2], [1,2,4]) == 2
    return


@app.cell
def _(sol):
    assert sol.maxUncrossedLines([2,5,1,2,5], [10,5,2,1,5,2]) == 3
    return


@app.cell
def _(sol):
    assert sol.maxUncrossedLines([1,3,7,1,7,5], [1,9,2,5,1]) == 2
    return


@app.cell
def _():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
