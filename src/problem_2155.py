import marimo

__generated_with = "0.7.9"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 2155](https://leetcode.com/problems/all-divisions-with-the-highest-score-of-a-binary-array)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def maxScoreIndices(self, nums: List[int]) -> List[int]:
            zeros, ones, n = 0, nums.count(1), len(nums)
            res, ma = [], 0
            for i in range(n + 1):
                score = ones + zeros
                if score > ma:
                    res = [i]
                    ma = score
                elif score == ma:
                    res.append(i)
                if i < n:
                    zeros += nums[i] == 0
                    ones -= nums[i] == 1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maxScoreIndices([0,0,1,0]) == [2,4]
    return


@app.cell
def __(sol):
    assert sol.maxScoreIndices([0,0,0]) == [3]
    return


@app.cell
def __(sol):
    assert sol.maxScoreIndices([1,1]) == [0]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
