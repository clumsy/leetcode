import marimo

__generated_with = "0.8.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2149](https://leetcode.com/problems/rearrange-array-elements-by-sign)""")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def rearrangeArray(self, nums: List[int]) -> List[int]:
            return [i for pair in zip((x for x in nums if x >= 0),
                                      (x for x in nums if x < 0)) for i in pair]
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.rearrangeArray([3,1,-2,-5,2,-4]) == [3,-2,1,-5,2,-4]
    return


@app.cell
def __(sol):
    assert sol.rearrangeArray([-1,1]) == [1,-1]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
