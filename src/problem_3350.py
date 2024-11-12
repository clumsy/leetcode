import marimo

__generated_with = "0.9.17"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3350](https://leetcode.com/problems/adjacent-increasing-subarrays-detection-ii)""")
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution2:
        def maxIncreasingSubarrays(self, nums: List[int]) -> int:
            n = len(nums)
            def works(k: int) -> bool:
                cur, prv = 1, 0
                for i in range(1, n):
                    if nums[i] > nums[i - 1]:
                        cur += 1
                    else:
                        prv, cur = min(k, cur), 1
                    if cur == prv == k or cur == 2 * k:
                        return True
                return False
            lo, hi = 0, n // 2
            while lo < hi:
                mi = hi - (hi - lo) // 2
                if not works(mi):
                    hi = mi - 1
                else:
                    lo = mi
            res = lo
            return res
    return (Solution2,)


@app.cell
def __(List):
    class Solution:
        def maxIncreasingSubarrays(self, nums: List[int]) -> int:
            n = len(nums)
            res = prv = cur = 1
            for i in range(1, n):
                if nums[i] <= nums[i - 1]:
                    prv, cur = cur, 1
                else:
                    cur += 1
                res = max(res, min(cur, prv), cur // 2)
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.maxIncreasingSubarrays([2,5,7,8,9,2,3,4,3,1]) == 3
    return


@app.cell
def __(sol):
    assert sol.maxIncreasingSubarrays([1,2,3,4,4,4,4,5,6,7]) == 2
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
