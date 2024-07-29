import marimo

__generated_with = "0.7.19"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3248](https://leetcode.com/problems/snake-in-matrix)""")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def finalPositionOfSnake(self, n: int, commands: List[str]) -> int:
            r = c = 0
            coms = {
                "UP": (-1, 0),
                "DOWN": (+1, 0),
                "LEFT": (0, -1),
                "RIGHT": (0, +1),
            }
            for com in commands:
                drc = coms[com]
                r, c = r + drc[0], c + drc[1]
            res = r * n + c
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.finalPositionOfSnake(2, ["RIGHT","DOWN"]) == 3
    return


@app.cell
def __(sol):
    assert sol.finalPositionOfSnake(3, ["DOWN","RIGHT","UP"]) == 1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
