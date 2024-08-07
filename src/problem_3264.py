import marimo

__generated_with = "0.8.3"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3264](https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i)""")
    return


@app.cell
def __():
    from typing import List
    from heapq import heappop, heappush
    return List, heappop, heappush


@app.cell
def __(List, heappop, heappush):
    class Solution:
        def getFinalState(self, nums: List[int], k: int, m: int) -> List[int]:
            h = []
            for i, e in enumerate(nums):
                heappush(h, (e, i))
            for _ in range(k):
                e, i = heappop(h)
                nums[i] = e * m
                heappush(h, (nums[i], i))
            res = nums
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.getFinalState([2,1,3,5,6], 5, 2) == [8,4,6,5,6]
    return


@app.cell
def __(sol):
    assert sol.getFinalState([1,2], 3, 4) == [16,8]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
