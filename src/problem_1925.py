import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def _(mo):
    mo.md("[Problem 1925](https://leetcode.com/problems/count-square-sum-triples)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __():
    class Solution:
        def countTriples(self, n: int) -> int:
            res = 0
            squares = set(i ** 2 for i in range(1, n + 1))
            for a_2 in squares:
                for b_2 in squares:
                    res += (a_2 + b_2) in squares
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countTriples(5) == 2
    return


@app.cell
def __(sol):
    assert sol.countTriples(10) == 4
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
