import marimo

__generated_with = "0.4.10"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 941](https://leetcode.com/problems/valid-mountain-array)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def validMountainArray(self, arr: List[int]) -> bool:
            n = len(arr)
            lo, hi = 0, n - 1
            while lo + 1 < n and arr[lo + 1] > arr[lo]:
                lo += 1
            while hi - 1 < n and arr[hi - 1] > arr[hi]:
                hi -= 1
            res = lo > 0 and hi < n - 1 and lo == hi
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert not sol.validMountainArray([2,1])
    return


@app.cell
def __(sol):
    assert not sol.validMountainArray([3,5,5])
    return


@app.cell
def __(sol):
    assert sol.validMountainArray([0,3,2,1])
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
