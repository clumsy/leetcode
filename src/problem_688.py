import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 688](https://leetcode.com/problems/knight-probability-in-chessboard)")
    return


@app.cell
def __():
    from functools import cache
    return cache,


@app.cell
def __(cache):
    class Solution:
        def knightProbability(self, n: int, k: int, row: int, col: int) -> float:

            @cache
            def count(x, y, r):
                if not (0 <= x < n) or not (0 <= y < n):
                    return 0
                if r == 0:
                    return 1
                res = (
                    count(x + 2, y + 1, r - 1) + count(x + 2, y - 1, r - 1) + count(x - 2, y + 1, r - 1) + count(x - 2, y - 1, r - 1) + 
                    count(x + 1, y + 2, r - 1) + count(x + 1, y - 2, r - 1) + count(x - 1, y + 2, r - 1) + count(x - 1, y - 2, r - 1)
                )
                return res
            
            cnt = count(row, col, k)
            res = cnt / (8 ** k)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.knightProbability(3, 2, 0, 0) == 0.0625
    return


@app.cell
def __(sol):
    assert sol.knightProbability(1, 0, 0, 0) == 1.
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
