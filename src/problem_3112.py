import marimo

__generated_with = "0.4.0"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3112](https://leetcode.com/problems/minimum-time-to-visit-disappearing-nodes)")
    return


@app.cell
def __():
    from math import inf
    from typing import List
    from collections import defaultdict
    from heapq import heappop, heappush
    return List, defaultdict, heappop, heappush, inf


@app.cell
def __(List, defaultdict, heappop, heappush, inf):
    class Solution:
        def minimumTime(self, n: int, edges: List[List[int]], dis: List[int]) -> List[int]:
            g = defaultdict(list)
            for i, (u, v, d) in enumerate(edges):
                g[u].append(i)
                g[v].append(i)
            res = [inf] * n
            res[0] = 0
            q = [(0, 0)]
            while q:
                d, cur = heappop(q)
                if d > res[cur]:
                    continue
                for i in g[cur]:
                    u, v, d = edges[i]
                    j = v if u == cur else u
                    if res[cur] + d < min(res[j], dis[j]):
                        res[j] = res[cur] + d
                        heappush(q, (res[j], j))
            for i in range(n):
                res[i] = res[i] if res[i] < inf else -1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumTime(3, [[0,1,2],[1,2,1],[0,2,4]], [1,1,5]) == [0,-1,4]
    return


@app.cell
def __(sol):
    assert sol.minimumTime(3, [[0,1,2],[1,2,1],[0,2,4]], [1,3,5]) == [0,2,3]
    return


@app.cell
def __(sol):
    assert sol.minimumTime(2, [[0,1,1]], [1,1]) == [0,-1]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
