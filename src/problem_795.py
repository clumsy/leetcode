import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 795](https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution2:
        def numSubarrayBoundedMax(self, nums: List[int], left: int, right: int) -> int:
            n = len(nums)
            res = lo = hi = 0
            while lo < n:
                if nums[lo] > right:
                    lo += 1
                    continue
                hi = lo
                ma = nums[lo]
                while hi < n and max(ma, nums[hi]) <= right:
                    ma = max(ma, nums[hi])
                    hi += 1
                i = lo
                while i < hi:
                    if left <= nums[i] <= right:
                        res += (i - lo + 1) * (hi - i)
                        lo = i + 1
                    i += 1
                lo = hi + 1
            return res
    return Solution2,


@app.cell
def __(List):
    class Solution:
        def numSubarrayBoundedMax(self, nums: List[int], left: int, right: int) -> int:
            n = len(nums)
            res = 0
            lo = hi = -1
            for i in range(n):
                if nums[i] > right:
                    lo = i
                if nums[i] >= left:
                    hi = i
                res += hi - lo
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.numSubarrayBoundedMax([2,1,4,3], 2, 3) == 3
    return


@app.cell
def __(sol):
    assert sol.numSubarrayBoundedMax([2,9,2,5,6], 2, 8) == 7
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
