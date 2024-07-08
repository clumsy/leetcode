import marimo

__generated_with = "0.7.5"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 2103](https://leetcode.com/problems/rings-and-rods)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __():
    class Solution:
        def countPoints(self, rings: str) -> int:
            rods = [0] * 10
            mask = {
                "R": 0b001,
                "G": 0b010,
                "B": 0b100,
            }
            for pair in range(len(rings) // 2):
                i = int(rings[2 * pair + 1])
                rods[i] |= mask[rings[2 * pair]]
            res = sum(r == 0b111 for r in rods)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countPoints("B0B6G0R6R0R6G9") == 1
    return


@app.cell
def __(sol):
    assert sol.countPoints("B0R0G0R9R0B0G0") == 1
    return


@app.cell
def __(sol):
    assert sol.countPoints("G4") == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
