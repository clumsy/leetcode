import marimo

__generated_with = "0.4.5"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3128](https://leetcode.com/problems/right-triangles)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def numberOfRightTriangles(self, g: List[List[int]]) -> int:
            res, rs, cs = 0, len(g), len(g[0])
            def diff(r, c):
                return (
                    (g[r - 1][c] if r else 0) + 
                    (g[r][c - 1] if c else 0) - 
                    (g[r - 1][c - 1] if r and c else 0)
                )
            for r in range(rs):
                for c in range(cs):
                    g[r][c] += diff(r, c)
            for r in range(rs):
                for c in range(cs):
                    if g[r][c] - diff(r, c) == 0:
                        continue
                    up = (g[r - 1][c] if r else 0) - (g[r - 1][c - 1] if r and c else 0)
                    dn = g[rs - 1][c] - (g[rs - 1][c - 1] if c else 0) - up - 1
                    lt = (g[r][c - 1] if c else 0) - (g[r - 1][c - 1] if r and c else 0)
                    rt = g[r][cs - 1] - (g[r - 1][cs - 1] if r else 0) - lt - 1
                    res += up * lt + up * rt + dn * lt + dn * rt
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.numberOfRightTriangles([[0,1,0],[0,1,1],[0,1,0]]) == 2
    return


@app.cell
def __(sol):
    assert sol.numberOfRightTriangles([[1,0,0,0],[0,1,0,1],[1,0,0,0]]) == 0
    return


@app.cell
def __(sol):
    assert sol.numberOfRightTriangles([[1,0,1],[1,0,0],[1,0,0]]) == 2
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
