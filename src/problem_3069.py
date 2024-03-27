import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3069](https://leetcode.com/problems/distribute-elements-into-two-arrays-i)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def resultArray(self, nums: List[int]) -> List[int]:
            a1, a2 = [nums[0]], [nums[1]]
            for i in nums[2:]:
                (a1 if a1[-1] > a2[-1] else a2).append(i)
            res = a1 + a2
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.resultArray([2,1,3]) == [2,3,1]
    return


@app.cell
def __(sol):
    assert sol.resultArray([5,4,3,8]) == [5,3,4,8]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
