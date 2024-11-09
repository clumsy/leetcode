import marimo

__generated_with = "0.9.17"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2352](https://leetcode.com/problems/equal-row-and-column-pairs)""")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(Counter, List):
    class Solution:
        def equalPairs(self, grid: List[List[int]]) -> int:
            res = 0
            cnt = Counter(tuple(row) for row in grid)
            for col in zip(*grid):
                res += cnt[col]
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.equalPairs([[3,2,1],[1,7,6],[2,7,7]]) == 1
    return


@app.cell
def __(sol):
    assert sol.equalPairs([[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]) == 3
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
