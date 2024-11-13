import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 1726](https://leetcode.com/problems/tuple-with-same-product)")
    return


@app.cell
def __():
    from collections import defaultdict
    from itertools import combinations
    from typing import List
    return List, combinations, defaultdict


@app.cell
def __(List, combinations, defaultdict):
    class Solution:
        def tupleSameProduct(self, nums: List[int]) -> int:
            cnt = defaultdict(int)
            for a, b in combinations(nums, 2):
                cnt[a * b] += 1
            res = sum(8 * v * (v - 1) // 2 for v in cnt.values())
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.tupleSameProduct([2,3,4,6]) == 8
    return


@app.cell
def __(sol):
    assert sol.tupleSameProduct([1,2,4,5,10]) == 16
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
