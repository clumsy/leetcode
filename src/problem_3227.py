import marimo

__generated_with = "0.7.9"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"[Problem 3227](https://leetcode.com/problems/vowels-game-in-a-string)")
    return


@app.cell
def __():
    class Solution:
        def doesAliceWin(self, s: str) -> bool:
            res = any(c in "aieou" for c in s)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.doesAliceWin("leetcoder")
    return


@app.cell
def __(sol):
    assert not sol.doesAliceWin("bbcd")
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
