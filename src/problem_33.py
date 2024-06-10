import marimo

__generated_with = "0.6.17"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 33](https://leetcode.com/problems/search-in-rotated-sorted-array)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def search(self, nums: List[int], target: int) -> int:
            lo, hi = 0, len(nums) - 1
            while lo < hi:
                mi = lo + (hi - lo) // 2
                if nums[mi] == target:
                    return mi
                # either lo->mi is sorted or mi->hi, based on which it is we check where target is
                if nums[lo] <= target < nums[mi] or target < nums[mi] < nums[hi] or nums[mi] < nums[hi] < target:
                    hi = mi - 1
                else:
                    lo = mi + 1
            return lo if nums[lo] == target else -1
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.search([4,5,6,7,0,1,2], 0) == 4
    return


@app.cell
def __(sol):
    assert sol.search([4,5,6,7,0,1,2], 3) == -1
    return


@app.cell
def __(sol):
    assert sol.search([1], 0) == -1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
