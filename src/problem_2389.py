import marimo

__generated_with = "0.9.11"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2389](https://leetcode.com/problems/longest-subsequence-with-limited-sum)""")
    return


@app.cell
def __():
    from typing import List
    from bisect import bisect_right
    return List, bisect_right


@app.cell
def __(List, bisect_right):
    class Solution:
        def answerQueries(self, nums: List[int], queries: List[int]) -> List[int]:
            nums.sort()
            n = len(nums)
            for i in range(n - 1):
                nums[i + 1] += nums[i]
            res = [bisect_right(nums, i) for i in queries]
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.answerQueries([4,5,2,1], [3,10,21]) == [2,3,4]
    return


@app.cell
def __(sol):
    assert sol.answerQueries([2,3,4,5], [1]) == [0]
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
