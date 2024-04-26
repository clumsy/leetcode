import marimo

__generated_with = "0.4.5"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(
        r"""
        [Problem 3000](https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle/description)
        """
    )
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def areaOfMaxDiagonal(self, dimensions: List[List[int]]) -> int:
            dimensions.sort(key=lambda d: (d[0] ** 2 + d[1] ** 2, d[0] * d[1]))
            res = dimensions[-1][0] * dimensions[-1][1]
            return res
    return Solution,


@app.cell
def __(List):
    class Solution:
        def areaOfMaxDiagonal(self, dimensions: List[List[int]]) -> int:
            res = ma = 0
            for d1, d2 in dimensions:
                cur = d1 ** 2 + d2 ** 2
                if cur >= ma:
                    res = d1 * d2 if cur > ma else max(res, d1 * d2)
                    ma = cur
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.areaOfMaxDiagonal([[9,3],[8,6]]) == 48
    return


@app.cell
def __(sol):
    assert sol.areaOfMaxDiagonal([[3,4],[4,3]]) == 12
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()

