import marimo

__generated_with = "0.3.12"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3111](https://leetcode.com/problems/minimum-rectangles-to-cover-points)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def minRectanglesToCoverPoints(self, p: List[List[int]], w: int) -> int:
            res, n = 1, len(p)
            ord = sorted(range(n), key=lambda x: p[x][0])
            s = p[ord[0]][0]
            for i in ord[1:]:
                x, _ = p[i]
                if x - s > w:
                    res += 1
                    s = x
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minRectanglesToCoverPoints([[2,1],[1,0],[1,4],[1,8],[3,5],[4,6]], 1) == 2
    return


@app.cell
def __(sol):
    assert sol.minRectanglesToCoverPoints([[0,0],[1,1],[2,2],[3,3],[4,4],[5,5],[6,6]], 2) == 3
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
