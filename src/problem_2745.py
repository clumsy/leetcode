import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2745](https://leetcode.com/problems/construct-the-longest-new-string)")
    return


@app.cell
def __():
    class Solution:
        def longestString(self, x: int, y: int, z: int) -> int:
            m = min(x, y)
            res = 2 * (z + min(m + 1, x) + min(m + 1, y))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.longestString(2, 5, 1) == 12
    return


@app.cell
def __(sol):
    assert sol.longestString(3, 2, 2) == 14
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
