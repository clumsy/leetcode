import marimo

__generated_with = "0.5.1"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3021](https://leetcode.com/problems/alice-and-bob-playing-flower-game)")
    return


@app.cell
def __():
    class Solution:
        def flowerGame(self, n: int, m: int) -> int:
            o1, e1 = (n + 1) // 2, n // 2
            o2, e2 = (m + 1) // 2, m // 2
            res = o1 * e2 + o2 * e1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.flowerGame(3, 2) == 3
    return


@app.cell
def __(sol):
    assert sol.flowerGame(1, 1) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
