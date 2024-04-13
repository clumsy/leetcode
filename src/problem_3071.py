import marimo

__generated_with = "0.3.12"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3071](https://leetcode.com/problems/minimum-operations-to-write-the-letter-y-on-a-grid)")
    return


@app.cell
def __():
    from typing import List
    from math import inf
    return List, inf


@app.cell
def __(List, inf):
    class Solution:
        def minimumOperationsToWriteY(self, grid: List[List[int]]) -> int:
            y, not_y = [0] * 3, [0] * 3
            n = len(grid)
            for r in range(n):
                for c in range(n):
                    yes = (
                        (r == c and r <= n // 2) or
                        (r == n - 1 - c and r <= n // 2) or
                        (c == n // 2 and r >= n // 2)
                    )
                    (y if yes else not_y)[grid[r][c]] += 1
            res = inf
            for i in range(3):
                for j in range(3):
                    if i != j:
                        cur = (
                            sum(v for k, v in enumerate(y) if k != i) + 
                            sum(v for k, v in enumerate(not_y) if k != j)
                        )
                        res = min(res, cur)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumOperationsToWriteY([[1,2,2],[1,1,0],[0,1,0]]) == 3
    return


@app.cell
def __(sol):
    assert sol.minimumOperationsToWriteY([[0,1,0,1,0],[2,1,0,1,2],[2,2,2,0,1],[2,2,2,2,2],[2,1,2,2,2]]) == 12
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
