import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 1424](https://leetcode.com/problems/diagonal-traverse-ii)")
    return


@app.cell
def __():
    from typing import List
    from collections import defaultdict
    return List, defaultdict


@app.cell
def __(List, defaultdict):
    class Solution:
        def findDiagonalOrder(self, nums: List[List[int]]) -> List[int]:
            res, i, rs = [], 0, len(nums)
            m = defaultdict(list)
            for r in reversed(range(rs)):
                for c in range(len(nums[r])):
                    m[r + c].append(nums[r][c])
            res = []
            for i in range(len(m)):
                res.extend(m[i])
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.findDiagonalOrder([[1,2,3],[4,5,6],[7,8,9]]) == [1,4,2,7,5,3,8,6,9]
    return


@app.cell
def __(sol):
    assert sol.findDiagonalOrder([[1,2,3,4,5],[6,7],[8],[9,10,11],[12,13,14,15,16]]) == [1,6,2,8,7,3,9,4,12,10,5,13,11,14,15,16]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
