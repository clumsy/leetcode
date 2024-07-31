import marimo

__generated_with = "0.7.19"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2161](https://leetcode.com/problems/partition-array-according-to-given-pivot)""")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def pivotArray(self, nums: List[int], pivot: int) -> List[int]:
            lt, gt, eq = 0, 0, 0
            for num in nums:
                if num < pivot:
                    lt += 1
                elif num == pivot:
                    eq += 1
            gt, eq, lt = lt + eq, lt, 0
            res = [0]*len(nums)
            for num in nums:
                if num > pivot:
                    pos, gt = gt, gt + 1
                elif num < pivot:
                    pos, lt = lt, lt + 1
                else:
                    pos, eq = eq, eq + 1
                res[pos] = num
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.pivotArray([9,12,5,10,14,3,10], 10) == [9,5,3,10,10,12,14]
    return


@app.cell
def __(sol):
    assert sol.pivotArray([-3,4,3,2], 2) == [-3,2,4,3]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
