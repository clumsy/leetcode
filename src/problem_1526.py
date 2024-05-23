import marimo

__generated_with = "0.6.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 1526](https://leetcode.com/problems/minimum-number-of-increments-on-subarrays-to-form-a-target-array)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def minNumberOperations(self, t: List[int]) -> int:
            res = sum(max(0, t[i] - (t[i - 1] if i else 0)) for i in range(len(t)))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minNumberOperations([1,2,3,2,1]) == 3
    return


@app.cell
def __(sol):
    assert sol.minNumberOperations([3,1,1,2]) == 4
    return


@app.cell
def __(sol):
    assert sol.minNumberOperations([3,1,5,4,2]) == 7
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
