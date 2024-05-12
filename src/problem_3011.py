import marimo

__generated_with = "0.5.1"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3011](https://leetcode.com/problems/find-if-array-can-be-sorted)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution2:
        def canSortArray(self, nums: List[int]) -> bool:
            n, i, s = len(nums), 0, 0
            while i < n:
                if nums[s].bit_count() != nums[i].bit_count():
                    nums[s:i] = sorted(nums[s:i])
                    s = i
                i += 1
            nums[s:i] = sorted(nums[s:i])
            res = nums == sorted(nums)
            return res
    return Solution2,


@app.cell
def __():
    from math import inf
    return inf,


@app.cell
def __(List, inf):
    class Solution:
        def canSortArray(self, nums: List[int]) -> bool:
            res, mi, ma, ma2 = True, inf, -inf, -inf
            s = i = 0
            while i < len(nums):
                if nums[s].bit_count() != nums[i].bit_count():
                    s, mi, ma2 = i, nums[i], ma
                ma = max(ma, nums[i])
                mi = min(mi, nums[i])
                if mi < ma2:
                    res = False
                i += 1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.canSortArray([8,4,2,30,15])
    return


@app.cell
def __(sol):
    assert sol.canSortArray([1,2,3,4,5])
    return


@app.cell
def __(sol):
    assert not sol.canSortArray([3,16,8,4,2])
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
