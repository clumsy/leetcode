import marimo

__generated_with = "0.9.4"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3192](https://leetcode.com/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-ii)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def minOperations(self, nums: List[int]) -> int:
            res = 0
            for i in nums:
                if i == res & 1:
                    res += 1
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.minOperations([0,1,1,0,1]) == 4
    return


@app.cell
def __(sol):
    assert sol.minOperations([1,0,0,0]) == 1
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
