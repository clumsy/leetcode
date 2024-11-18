import marimo

__generated_with = "0.9.20"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3355](https://leetcode.com/problems/zero-array-transformation-i)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def isZeroArray(self, nums: List[int], q: List[List[int]]) -> bool:
            n = len(nums)
            d = [0] * (n + 1)
            for l, r in q:
                d[l] += 1
                d[r + 1] += -1
            c = 0
            for i in range(n):
                c += d[i]
                if nums[i] > c:
                    res = False
                    break
            else:
                res = True
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.isZeroArray([1,0,1], [[0,2]])
    return


@app.cell
def __(sol):
    assert not sol.isZeroArray([4,3,2,1], [[1,3],[0,2]])
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
