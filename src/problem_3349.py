import marimo

__generated_with = "0.9.17"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3349](https://leetcode.com/problems/adjacent-increasing-subarrays-detection-i)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def hasIncreasingSubarrays(self, nums: List[int], k: int) -> bool:
            res, n, cur, prv = False, len(nums), 1, 0
            for i in range(1, n):
                if nums[i] > nums[i - 1]:
                    cur += 1
                else:
                    prv, cur = min(k, cur), 1
                if cur == prv == k or cur == 2 * k:
                    res = True
                    break
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.hasIncreasingSubarrays([2,5,7,8,9,2,3,4,3,1], 3)
    return


@app.cell
def __(sol):
    assert not sol.hasIncreasingSubarrays([1,2,3,4,4,4,4,5,6,7], 5)
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
