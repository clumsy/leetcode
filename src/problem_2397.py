import marimo

__generated_with = "0.3.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2397](https://leetcode.com/problems/maximum-rows-covered-by-columns)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __():
    def bit_count(i):
        return bin(i)[2:].count("1")
    return bit_count,


@app.cell
def __(List, bit_count):
    class Solution2:
        def maximumRows(self, matrix: List[List[int]], sel: int) -> int:
            m, n = len(matrix), len(matrix[0])
            mask = [0] * m
            for r in range(m):
                for c in range(n):
                    if matrix[r][c]:
                        mask[r] |= (1 << c)
            res = 0
            for m in range(2 ** n):
                if bit_count(m) == sel:
                    res = max(res, sum(i & m == i for i in mask))
            return res
    return Solution2,


@app.cell
def __(List, bit_count):
    class Solution:
        def maximumRows(self, matrix: List[List[int]], sel: int) -> int:
            m, n = len(matrix), len(matrix[0])
            for r in range(m):
                for c in range(n):
                    if matrix[r][c]:
                        matrix[r][0] |= (1 << c)
            res = 0
            for mask in range(2 ** n):
                if bit_count(mask) == sel:
                    res = max(res, sum(matrix[r][0] & mask == matrix[r][0] for r in range(m)))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maximumRows([[0,0,0],[1,0,1],[0,1,1],[0,0,1]], 2) == 3
    return


@app.cell
def __(sol):
    assert sol.maximumRows([[1],[0]], 1) == 2
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
