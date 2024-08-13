import marimo

__generated_with = "0.8.7"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3243](https://leetcode.com/problems/shortest-distance-after-road-addition-queries-i)""")
    return


@app.cell
def __():
    from math import inf
    from typing import List
    from bisect import insort
    return List, inf, insort


@app.cell
def __(List, inf, insort):
    class Solution2:
        def shortestDistanceAfterQueries(self, n: int, q: List[List[int]]) -> List[int]:
            res = [0] * len(q)
            e = [(i, i + 1) for i in range(n - 1)]
            for i, (f, t) in enumerate(q):
                d = [inf] * n
                d[0] = 0
                insort(e, (f, t))
                for f, t in e:
                    d[t] = min(d[t], d[f] + 1)
                res[i] = d[n - 1]
            return res
    return Solution2,


@app.cell
def __(List, inf):
    class Solution:
        def shortestDistanceAfterQueries(self, n: int, q: List[List[int]]) -> List[int]:
            res = [0] * len(q)
            e = {i: [i + 1] for i in range(n - 1)}
            for i, (f, t) in enumerate(q):
                e[f].append(t)
                d = [inf] * n
                d[0] = 0
                for u in range(n):
                    for v in e.get(u, []):
                        if d[u] + 1 < d[v]:
                            d[v] = d[u] + 1
                res[i] = d[n - 1]
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.shortestDistanceAfterQueries(5, [[2,4],[0,2],[0,4]]) == [3,2,1]
    return


@app.cell
def __(sol):
    assert sol.shortestDistanceAfterQueries(4, [[0,3],[0,2]]) == [1,1]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
