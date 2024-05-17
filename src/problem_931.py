import marimo

__generated_with = "0.5.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 931](https://leetcode.com/problems/minimum-falling-path-sum)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def minFallingPathSum(self, matrix: List[List[int]]) -> int:
            rows, cols = len(matrix), len(matrix[0])
            for r in range(rows - 2, -1, -1):
                for c in range(cols):
                    matrix[r][c] += min(
                        matrix[r + 1][c],
                        matrix[r + 1][max(0, c - 1)],
                        matrix[r + 1][min(cols - 1, c + 1)],
                    )
            res = min(matrix[0])
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minFallingPathSum([[2,1,3],[6,5,4],[7,8,9]]) == 13
    return


@app.cell
def __(sol):
    assert sol.minFallingPathSum([[-19,57],[-40,-5]]) == -59
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
