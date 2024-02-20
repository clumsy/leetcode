import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3033](https://leetcode.com/problems/modify-the-matrix)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def modifiedMatrix(self, m: List[List[int]]) -> List[List[int]]:
            rs, cs = len(m), len(m[0])
            for c in range(cs):
                ma = max(m[r][c] for r in range(rs))
                for r in range(rs):
                    m[r][c] = ma if m[r][c] < 0 else m[r][c]
            return m
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.modifiedMatrix([[1,2,-1],[4,-1,6],[7,8,9]]) == [[1,2,9],[4,8,6],[7,8,9]]
    return


@app.cell
def __(sol):
    assert sol.modifiedMatrix([[3,-1],[5,2]]) == [[3,2],[5,2]]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
