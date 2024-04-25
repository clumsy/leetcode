import marimo

__generated_with = "0.4.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3026](https://leetcode.com/problems/maximum-good-subarray-sum)")
    return


@app.cell
def __():
    from math import inf
    from typing import List
    return List, inf


@app.cell
def __(List, inf):
    class Solution:
        def maximumSubarraySum(self, nums: List[int], k: int) -> int:
            n, sm = len(nums), {}
            res, s = -inf, 0
            for e in nums:
                for v in (e - k, e + k):
                    if v in sm:
                        res = max(res, s + e - sm[v])
                sm[e] = min(sm.get(e, inf), s)
                s += e
            res = res if res != -inf else 0
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maximumSubarraySum([1,2,3,4,5,6], 1) == 11
    return


@app.cell
def __(sol):
    assert sol.maximumSubarraySum([-1,3,2,4,5], 3) == 11
    return


@app.cell
def __(sol):
    assert sol.maximumSubarraySum([-1,-2,-3,-4], 2) == -6
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
