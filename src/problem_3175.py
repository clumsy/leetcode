import marimo

__generated_with = "0.9.11"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3175](https://leetcode.com/problems/find-the-first-player-to-win-k-games-in-a-row)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def findWinningPlayer(self, skills: List[int], k: int) -> int:
            res = None
            for i, s in enumerate(skills):
                if res is None:
                    res, cur = i, 0
                elif s > skills[res]:
                    res, cur = i, 1
                else:
                    cur += 1
                if cur == k:
                    break
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.findWinningPlayer([4,2,6,3,9], 2) == 2
    return


@app.cell
def __(sol):
    assert sol.findWinningPlayer([2,5,4], 3) == 1
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
