import marimo

__generated_with = "0.7.12"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3232](https://leetcode.com/problems/find-if-digit-game-can-be-won)""")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def canAliceWin(self, nums: List[int]) -> bool:
            s = [0, 0]
            for i in nums:
                s[i > 9] += i
            res = s[0] != s[1]
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert not sol.canAliceWin([1,2,3,4,10])
    return


@app.cell
def __(sol):
    assert sol.canAliceWin([1,2,3,4,5,14])
    return


@app.cell
def __(sol):
    assert sol.canAliceWin([5,5,5,25])
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
