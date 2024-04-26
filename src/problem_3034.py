import marimo

__generated_with = "0.4.5"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3034](https://leetcode.com/problems/number-of-subarrays-that-match-a-pattern-i)")
    return


@app.cell
def __():
    from typing import List
    from itertools import pairwise
    return List, pairwise


@app.cell
def __(List, pairwise):
    class Solution:
        def countMatchingSubarrays(self, nums: List[int], pattern: List[int]) -> int:
            x = pattern + [-2] + [1 if s > f else -1 if s < f else 0 for f, s in pairwise(nums)]
            res, p = 0, [0] * len(x)
            for i in range(1, len(x)):
                j = p[i - 1]
                while j and x[i] != x[j]:
                    j = p[j - 1]
                p[i] = j + (x[i] == x[j])
                res += p[i] == len(pattern)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countMatchingSubarrays([1,2,3,4,5,6], [1,1]) == 4
    return


@app.cell
def __(sol):
    assert sol.countMatchingSubarrays([1,4,4,1,3,5,5,3], [1,0,-1]) == 2
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
