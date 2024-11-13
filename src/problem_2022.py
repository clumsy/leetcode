import marimo

__generated_with = "0.7.5"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2022](https://leetcode.com/problems/convert-1d-array-into-2d-array)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def construct2DArray(self, original: List[int], m: int, n: int) -> List[List[int]]:
            res = [[original[r * n + c] for c in range(n)] for r in range(m)] if m * n == len(original) else []
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.construct2DArray([1,2,3,4], 2, 2) == [[1,2],[3,4]]
    return


@app.cell
def __(sol):
    assert sol.construct2DArray([1,2,3], 1, 3) == [[1,2,3]]
    return


@app.cell
def __(sol):
    assert sol.construct2DArray([1,2], 1, 1) == []
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()

