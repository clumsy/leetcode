import marimo

__generated_with = "0.9.14"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2357](https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def minimumOperations(self, nums: List[int]) -> int:
            # each unique bit representation will require at least 1 operation
            # hence counting unique numbers
            res = len(set(i for i in nums if i))
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.minimumOperations([1,5,0,3,5]) == 3
    return


@app.cell
def __(sol):
    assert sol.minimumOperations([0]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
