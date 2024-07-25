import marimo

__generated_with = "0.7.17"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2164](https://leetcode.com/problems/sort-even-and-odd-indices-independently)""")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def sortEvenOdd(self, nums: List[int]) -> List[int]:
            nums[::2], nums[1::2] = sorted(nums[::2]), sorted(nums[1::2], reverse=True)
            res = nums
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.sortEvenOdd([4,1,2,3]) == [2,3,4,1]
    return


@app.cell
def __(sol):
    assert sol.sortEvenOdd([2,1]) == [2,1]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
