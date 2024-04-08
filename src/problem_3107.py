import marimo

__generated_with = "0.3.8"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3107](https://leetcode.com/problems/minimum-operations-to-make-median-of-array-equal-to-k)")
    return


@app.cell
def __():
    from typing import List
    from heapq import heappop, heappush, heapify
    return List, heapify, heappop, heappush


@app.cell
def __(List, heapify, heappop):
    class Solution:
        def minOperationsToMakeMedianK(self, nums: List[int], k: int) -> int:
            lo, hi = [], []
            for i in nums:
                if i > k:
                    hi.append(i)
                else:
                    lo.append(-i)
            res, n = 0, len(nums)
            hi_size = (n - 1) // 2
            lo_size = n - hi_size
            if len(hi) > hi_size:
                heapify(hi)
                while len(hi) > hi_size:
                    res += heappop(hi) - k
            else:
                heapify(lo)
                while len(lo) >= lo_size:
                    res += k - (-heappop(lo))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minOperationsToMakeMedianK([2,5,6,8,5], 4) == 2
    return


@app.cell
def __(sol):
    assert sol.minOperationsToMakeMedianK([2,5,6,8,5], 7) == 3
    return


@app.cell
def __(sol):
    assert sol.minOperationsToMakeMedianK([1,2,3,4,5,6], 4) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
