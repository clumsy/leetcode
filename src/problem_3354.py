import marimo

__generated_with = "0.9.20"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3354](https://leetcode.com/problems/make-array-elements-equal-to-zero)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def countValidSelections(self, nums: List[int]) -> int:
            rgt = sum(nums)
            res = lft = 0
            for i in nums:
                if i == 0:
                    res += 2 if lft == rgt else 1 if abs(lft - rgt) == 1 else 0
                else:
                    rgt -= i
                    lft += i
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.countValidSelections([1,0,2,0,3]) == 2
    return


@app.cell
def __(sol):
    assert sol.countValidSelections([2,3,4,0,4,1,0]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
