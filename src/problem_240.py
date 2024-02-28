import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 240](https://leetcode.com/problems/search-a-2d-matrix-ii)")
    return


@app.cell
def __():
    from typing import List
    from bisect import bisect_left
    return List, bisect_left


@app.cell
def __(List, bisect_left):
    class Solution2:
        def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
            m, n = len(matrix), len(matrix[0])
            for r in range(m):
                c = bisect_left(matrix[r], target)
                if c < n and matrix[r][c] == target:
                    return True
            return False
    return Solution2,


@app.cell
def __(List):
    class Solution:
        def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
            m, n = len(matrix), len(matrix[0])
            r, c = 0, n - 1
            while r < m:
                while c >= 0 and matrix[r][c] >= target:
                    if matrix[r][c] == target:
                        return True
                    c -= 1
                r += 1
            return False
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.searchMatrix([[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], 5)
    return


@app.cell
def __(sol):
    assert not sol.searchMatrix([[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], 20)
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
