import marimo

__generated_with = "0.3.12"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3070](https://leetcode.com/problems/count-submatrices-with-top-left-element-and-sum-less-than-k)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def countSubmatrices(self, g: List[List[int]], k: int) -> int:
            res, rs, cs = 0, len(g), len(g[0])
            for r in range(rs):
                for c in range(cs):
                    if c > 0:
                        g[r][c] += g[r][c - 1]
                    if r > 0:
                        g[r][c] += g[r - 1][c]
                    if r > 0 and c > 0:
                        g[r][c] -= g[r - 1][c - 1]
                    res += g[r][c] <= k
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countSubmatrices([[7,6,3],[6,6,1]], 18) == 4
    return


@app.cell
def __(sol):
    assert sol.countSubmatrices([[7,2,9],[1,5,0],[2,6,6]], 20) == 6
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
