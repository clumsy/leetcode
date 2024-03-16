import marimo

__generated_with = "0.3.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2477](https://leetcode.com/problems/minimum-fuel-cost-to-report-to-the-capital)")
    return


@app.cell
def __():
    from typing import List
    from collections import defaultdict
    return List, defaultdict


@app.cell
def __(List, defaultdict):
    class Solution:
        def minimumFuelCost(self, roads: List[List[int]], seats: int) -> int:
            edges = defaultdict(list)
            for road in roads:
                edges[road[0]].append(road[1])
                edges[road[1]].append(road[0])

            def dfs(p, v, res):
                reprs = 0
                for u in edges[v]:
                    if u != p:
                        res, child_reprs = dfs(v, u, res)
                        reprs += child_reprs

                if v == p:
                    return res

                reprs += 1
                return res + (reprs + seats - 1) // seats, reprs

            res = dfs(0, 0, 0)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumFuelCost([[0,1],[0,2],[0,3]], 5) == 3
    return


@app.cell
def __(sol):
    assert sol.minimumFuelCost([[3,1],[3,2],[1,0],[0,4],[0,5],[4,6]], 2) == 7
    return


@app.cell
def __(sol):
    assert sol.minimumFuelCost([], 1) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
