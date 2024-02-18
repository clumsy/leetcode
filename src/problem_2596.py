import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2596](https://leetcode.com/problems/check-knight-tour-configuration)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def checkValidGrid(self, grid: List[List[int]]) -> bool:
            res = grid[0][0] == 0
            if res:
                rs, cs = len(grid), len(grid[0])
                m = {grid[r][c]: (r, c) for r in range(rs) for c in range(cs)}
                for i in range(1, rs * cs):
                    r1, c1 = m[i]
                    r0, c0 = m[i - 1]
                    if abs(r1 - r0) * abs(c1 - c0) != 2:
                        res = False
                        break
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.checkValidGrid([[0,11,16,5,20],[17,4,19,10,15],[12,1,8,21,6],[3,18,23,14,9],[24,13,2,7,22]])
    return


@app.cell
def __(sol):
    assert not sol.checkValidGrid([[0,3,6],[5,8,1],[2,7,4]])
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
