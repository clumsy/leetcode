import marimo

__generated_with = "0.5.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3142](https://leetcode.com/problems/check-if-grid-satisfies-conditions)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def satisfiesConditions(self, g: List[List[int]]) -> bool:
            m, n = len(g), len(g[0])
            res = all(g[0][c + 1] != g[0][c] for c in range(n - 1))
            res = res and all(g[r][c] == g[r - 1][c] for r in range(1, m) for c in range(n))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.satisfiesConditions([[1,0,2],[1,0,2]])
    return


@app.cell
def __(sol):
    assert not sol.satisfiesConditions([[1,1,1],[0,0,0]])
    return


@app.cell
def __(sol):
    assert not sol.satisfiesConditions([[1],[2],[3]])
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
