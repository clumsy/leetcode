import marimo

__generated_with = "0.3.8"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3100](https://leetcode.com/problems/water-bottles-ii)")
    return


@app.cell
def __():
    class Solution:
        def maxBottlesDrunk(self, nb: int, ne: int) -> int:
            res = 0
            while nb >= ne:
                res += ne
                nb -= ne - 1
                ne += 1
            res += nb
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maxBottlesDrunk(13, 6) == 15
    return


@app.cell
def __(sol):
    assert sol.maxBottlesDrunk(10, 3) == 13
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
