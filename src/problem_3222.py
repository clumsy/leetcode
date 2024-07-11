import marimo

__generated_with = "0.7.9"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"[Problem 3222](https://leetcode.com/problems/find-the-winning-player-in-coin-game)")
    return


@app.cell
def __():
    class Solution:
        def losingPlayer(self, x: int, y: int) -> str:
            res = "Alice" if min(x, y // 4) & 1 == 1 else "Bob"
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.losingPlayer(2, 7) == "Alice"
    return


@app.cell
def __(sol):
    assert sol.losingPlayer(4, 11) == "Bob"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
