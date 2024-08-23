import marimo

__generated_with = "0.8.14"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2133](https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers)""")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def checkValid(self, matrix: List[List[int]]) -> bool:
            n = len(matrix)
            s = set(range(1, n + 1))
            res = (
                all(set(matrix[i]) == s for i in range(n)) and
                all(set(matrix[i][j] for i in range(n)) == s for j in range(n))
            )
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.checkValid([[1,2,3],[3,1,2],[2,3,1]])
    return


@app.cell
def __(sol):
    assert not sol.checkValid([[1,1,1],[1,2,3],[1,2,3]])
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
