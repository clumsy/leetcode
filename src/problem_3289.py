import marimo

__generated_with = "0.8.15"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3289](https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville)""")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def getSneakyNumbers(self, nums: List[int]) -> List[int]:
            res, uniq = [], set()
            for i in nums:
                if i in uniq:
                    res.append(i)
                else:
                    uniq.add(i)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.getSneakyNumbers([0,1,1,0]) == [1,0]
    return


@app.cell
def __(sol):
    assert sol.getSneakyNumbers([0,3,2,1,3,2]) == [3,2]
    return


@app.cell
def __(sol):
    assert sol.getSneakyNumbers([0,3,2,1,3,2]) == [3,2]
    return


@app.cell
def __(sol):
    assert sol.getSneakyNumbers([7,1,5,4,3,4,6,0,9,5,8,2]) == [4,5]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
