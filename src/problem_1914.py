import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def _(mo):
    mo.md(
        r"""
        [Problem 1914](https://leetcode.com/problems/cyclically-rotating-a-grid/description)
        """
    )
    return


@app.cell
def _():
    from typing import List
    return List,


@app.cell
def _(List):
    class Solution:
        def rotateGrid(self, grid: List[List[int]], k: int) -> List[List[int]]:
            rs, cs = len(grid), len(grid[0])
            def coord(lr, lc, rr, rc, i):
                w, h = (rc - lc), (rr - lr)
                i = i % (2 * w + 2 * h)
                if i < w:
                    return lr, lc + i
                elif w <= i < w + h:
                    return lr + (i - w), rc
                elif w + h <= i < 2 * w + h:
                    return rr, rc - (i - w - h)
                else:  # i >= 2 * w + h
                    return rr - (i - 2 * w - h), lc
            res = [[None] * cs for _ in range(rs)]
            for i in range(min(rs, cs) // 2):
                lr, lc = i, i
                rr, rc = rs - 1 - i, cs - 1 - i
                x = k
                for c in range(lc, rc):
                    r_, c_ = coord(lr, lc, rr, rc, x)
                    x += 1
                    res[lr][c] = grid[r_][c_]
                for r in range(lr, rr):
                    r_, c_ = coord(lr, lc, rr, rc, x)
                    x += 1
                    res[r][rc] = grid[r_][c_]
                for c in range(rc, lc, -1):
                    r_, c_ = coord(lr, lc, rr, rc, x)
                    x += 1
                    res[rr][c] = grid[r_][c_]
                for r in range(rr, lr, -1):
                    r_, c_ = coord(lr, lc, rr, rc, x)
                    x += 1
                    res[r][lc] = grid[r_][c_]
            return res
    return Solution,


@app.cell
def _(Solution):
    sol = Solution()
    return sol,


@app.cell
def _(sol):
    assert sol.rotateGrid([[40,10],[30,20]], 1) == [[10,20],[40,30]]
    return


@app.cell
def _(sol):
    assert sol.rotateGrid([[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]], 2) == [[3,4,8,12],[2,11,10,16],[1,7,6,15],[5,9,13,14]]
    return


@app.cell
def _():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()

