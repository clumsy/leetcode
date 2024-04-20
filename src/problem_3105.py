import marimo

__generated_with = "0.4.0"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3105](https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def longestMonotonicSubarray(self, nums: List[int]) -> int:
            inc_len = inc_cur = 1
            dec_len = dec_cur = 1
            for i in range(1, len(nums)):
                if nums[i] > nums[i - 1]:
                    inc_cur += 1
                    dec_cur = 1
                elif nums[i] < nums[i - 1]:
                    inc_cur = 1
                    dec_cur += 1
                else:
                    inc_cur = dec_cur = 1
                inc_len = max(inc_len, inc_cur)
                dec_len = max(dec_len, dec_cur)
            res = max(inc_len, dec_len)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.longestMonotonicSubarray([1,4,3,3,2]) == 2
    return


@app.cell
def __(sol):
    assert sol.longestMonotonicSubarray([3,3,3,3]) == 1
    return


@app.cell
def __(sol):
    assert sol.longestMonotonicSubarray([3,2,1]) == 3
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
