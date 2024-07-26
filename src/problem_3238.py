import marimo

__generated_with = "0.7.19"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3238](https://leetcode.com/problems/find-the-number-of-winning-players)""")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(Counter, List):
    class Solution:
        def winningPlayerCount(self, n: int, pick: List[List[int]]) -> int:
            cnt = [Counter() for _ in range(n)]
            for i, p in pick:
                cnt[i][p] += 1
            res = sum(max(cnt[i].values(), default=0) > i for i in range(n))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.winningPlayerCount(4, [[0,0],[1,0],[1,0],[2,1],[2,1],[2,0]]) == 2
    return


@app.cell
def __(sol):
    assert sol.winningPlayerCount(5, [[1,1],[1,2],[1,3],[1,4]]) == 0
    return


@app.cell
def __(sol):
    assert sol.winningPlayerCount(5, [[1,1],[2,4],[2,4],[2,4]]) == 1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
