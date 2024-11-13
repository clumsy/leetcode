import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def _(mo):
    mo.md("[Problem 1014](https://leetcode.com/problems/best-sightseeing-pair)")
    return


@app.cell
def _():
    from typing import List
    return List,


@app.cell
def _(List):
    class Solution:
        def maxScoreSightseeingPair(self, values: List[int]) -> int:
            res, left = 0, values[0]
            for j in range(1, len(values)):
                res = max(res, left + values[j] - j)
                left = max(left, values[j] + j)
            return res
    return Solution,


@app.cell
def _(Solution):
    sol = Solution()
    return sol,


@app.cell
def _(sol):
    assert sol.maxScoreSightseeingPair([8,1,5,2,6]) == 11
    return


@app.cell
def _(sol):
    assert sol.maxScoreSightseeingPair([1,2]) == 2
    return


@app.cell
def _():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()

