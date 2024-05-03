import marimo

__generated_with = "0.4.10"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3127](https://leetcode.com/problems/make-a-square-with-the-same-color)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def canMakeSquare(self, g: List[List[str]]) -> bool:
            res = 0
            for r in range(2):
                for c in range(2):
                    res += sum(c == "B" for c in (g[r][c], g[r + 1][c], g[r][c + 1], g[r + 1][c + 1])) == 2
            res = res != 4
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.canMakeSquare([["B","W","B"],["B","W","W"],["B","W","B"]])
    return


@app.cell
def __(sol):
    assert not sol.canMakeSquare([["B","W","B"],["W","B","W"],["B","W","B"]])
    return


@app.cell
def __(sol):
    assert sol.canMakeSquare([["B","W","B"],["B","W","W"],["B","W","W"]])
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
