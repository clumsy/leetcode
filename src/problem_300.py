import marimo

__generated_with = "0.6.0"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 300](https://leetcode.com/problems/longest-increasing-subsequence)")
    return


@app.cell
def __():
    from typing import List
    from bisect import bisect_left
    return List, bisect_left


@app.cell
def __(List, bisect_left):
    class Solution:
        def lengthOfLIS(self, nums: List[int]) -> int:
            min_for_length, n = [], len(nums)
            for num in nums:
                if not min_for_length or num > min_for_length[-1]:
                    min_for_length.append(num)
                else:
                    lo = bisect_left(min_for_length, num)
                    min_for_length[lo] = num
            return len(min_for_length)
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.lengthOfLIS([10,9,2,5,3,7,101,18]) == 4
    return


@app.cell
def __(sol):
    assert sol.lengthOfLIS([0,1,0,3,2,3]) == 4
    return


@app.cell
def __(sol):
    assert sol.lengthOfLIS([7,7,7,7,7,7,7]) == 1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
