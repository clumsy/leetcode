import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def _(mo):
    mo.md(
        r"""
        [Problem 1018](https://leetcode.com/problems/binary-prefix-divisible-by-5/description)
        """
    )
    return


@app.cell
def _():
    from typing import List
    return List,


@app.cell
def _(List):
    class Solution:
        def prefixesDivBy5(self, nums: List[int]) -> List[bool]:
            res, c = [], 0
            for i in nums:
                c = (c << 1) + i
                res.append(c % 5 == 0)
            return res
    return Solution,


@app.cell
def _(Solution):
    sol = Solution()
    return sol,


@app.cell
def _(sol):
    assert sol.prefixesDivBy5([0,1,1]) == [True,False,False]
    return


@app.cell
def _(sol):
    assert sol.prefixesDivBy5([1,1,1]) == [False,False,False]
    return


@app.cell
def _():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()

