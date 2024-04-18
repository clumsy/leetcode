import marimo

__generated_with = "0.4.0"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2099](https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def maxSubsequence(self, nums: List[int], k: int) -> List[int]:
            n = len(nums)
            largest = sorted(range(n), key=nums.__getitem__)[-k:]
            res = [nums[i] for i in sorted(largest)]
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maxSubsequence([2,1,3,3], 2) == [3,3]
    return


@app.cell
def __(sol):
    assert sol.maxSubsequence([-1,-2,3,4], 3) == [-1,3,4]
    return


@app.cell
def __(sol):
    assert sol.maxSubsequence([3,4,3,3], 2) == [4,3]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
