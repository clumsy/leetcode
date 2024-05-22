import marimo

__generated_with = "0.6.0"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3152](https://leetcode.com/problems/special-array-ii)")
    return


@app.cell
def __():
    from typing import List
    from bisect import bisect_right
    return List, bisect_right


@app.cell
def __(List, bisect_right):
    class Solution:
        def isArraySpecial(self, nums: List[int], queries: List[List[int]]) -> List[bool]:
            segs, n = [0], len(nums)
            for i in range(n):
                if i > 0 and nums[i] & 1 == nums[i - 1] & 1:
                    segs.append(i)
            res = []
            for s, e in queries:
                cur = bisect_right(segs, s) == bisect_right(segs, e)
                res.append(cur)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.isArraySpecial([3,4,1,2,6], [[0,4]]) == [False]
    return


@app.cell
def __(sol):
    assert sol.isArraySpecial([4,3,1,6], [[0,2],[2,3]]) == [False, True]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
