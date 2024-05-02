import marimo

__generated_with = "0.4.10"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2841](https://leetcode.com/problems/maximum-sum-of-almost-unique-subarray)")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(Counter, List):
    class Solution:
        def maxSum(self, nums: List[int], m: int, k: int) -> int:
            n, uniq = len(nums), Counter()
            res = cur = j = 0
            for i in range(n):
                ni = nums[i]
                uniq[ni] += 1
                cur += ni
                if i - j >= k:
                    nj = nums[j]
                    uniq[nj] -= 1
                    cur -= nj
                    if uniq[nj] == 0:
                        del uniq[nj]
                    j += 1
                if len(uniq) >= m:
                    res = max(res, cur)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maxSum([2,6,7,3,1,7], 3, 4) == 18
    return


@app.cell
def __(sol):
    assert sol.maxSum([5,9,9,2,4,5,4], 1, 3) == 23
    return


@app.cell
def __(sol):
    assert sol.maxSum([1,2,1,2,1,2,1], 3, 3) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
