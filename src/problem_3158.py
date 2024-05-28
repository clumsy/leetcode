import marimo

__generated_with = "0.6.10"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(rf"[Problem 3158](https://leetcode.com/problems/find-the-xor-of-numbers-which-appear-twice)")
    return


@app.cell
def __():
    from typing import List
    from functools import reduce
    from operator import xor
    return List, reduce, xor


@app.cell
def __(List, reduce, xor):
    class Solution:
        def duplicateNumbersXOR(self, nums: List[int]) -> int:
            onc, twc = set(), set()
            for i in nums:
                (twc if i in onc else onc).add(i)
            res = reduce(xor, twc or [0])
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.duplicateNumbersXOR([1,2,1,3]) == 1
    return


@app.cell
def __(sol):
    assert sol.duplicateNumbersXOR([1,2,3]) == 0
    return


@app.cell
def __(sol):
    assert sol.duplicateNumbersXOR([1,2,2,1]) == 3
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
