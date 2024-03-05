import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3065](https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def minOperations(self, nums: List[int], k: int) -> int:
            res = sum(i < k for i in nums)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minOperations([2,11,10,1,3], 10) == 3
    return


@app.cell
def __(sol):
    assert sol.minOperations([1,1,2,4,9], 1) == 0
    return


@app.cell
def __(sol):
    assert sol.minOperations([1,1,2,4,9], 9) == 4
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
