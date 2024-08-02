import marimo

__generated_with = "0.7.20"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("""[Problem 2148](https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements)""")
    return


@app.cell
def __():
    from typing import List
    from math import inf
    return List, inf


@app.cell
def __(List):
    class Solution2:
        def countElements(self, nums: List[int]) -> int:
            nums.sort()
            res, n = (0, len(nums))
            lo = cur = 0
            while cur + 1 < n:
                while lo + 1 < n and nums[lo] == nums[lo + 1]:
                    lo += 1
                cur = min(n - 1, lo + 1)
                while cur + 1 < n and nums[cur] == nums[cur + 1]:
                    cur += 1
                hi = min(n - 1, cur + 1)
                while hi + 1 < n and nums[hi] == nums[hi + 1]:
                    hi += 1
                if nums[lo] < nums[cur] < nums[hi]:
                    res += cur - lo
                lo, cur = (cur, hi)
            return res
    return Solution2,


@app.cell
def __(List, inf):
    class Solution:
        def countElements(self, nums: List[int]) -> int:
            res, n = (0, len(nums))
            mi, num_mi, ma, num_ma = (inf, 0, -inf, 0)
            for i in nums:
                if i < mi:
                    mi, num_mi = (i, 0)
                num_mi += i == mi
                if i > ma:
                    ma, num_ma = (i, 0)
                num_ma += i == ma
            res = max(0, n - num_mi - num_ma)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countElements([11, 7, 2, 15]) == 2
    return


@app.cell
def __(sol):
    assert sol.countElements([-3, 3, 3, 90]) == 2
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
