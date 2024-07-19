import marimo

__generated_with = "0.7.9"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 2150](https://leetcode.com/problems/find-all-lonely-numbers-in-the-array)")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(Counter, List):
    class Solution:
        def findLonely(self, nums: List[int]) -> List[int]:
            res, cnt = [], Counter(nums)
            for v in cnt:
                if cnt[v] == 1 and cnt[v - 1] == cnt[v + 1] == 0:
                    res.append(v)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.findLonely([10,6,5,8]) == [10,8]
    return


@app.cell
def __(sol):
    assert sol.findLonely([1,3,5,3,]) == [1,5]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
