import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 743](https://leetcode.com/problems/network-delay-time)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List, inf):
    class Solution3:
        def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
            dst = [[inf] * n for _ in range(n)]
            for u, v, w in times:
                dst[u - 1][v - 1] = w
            for p in range(n):
                for i in range(n):
                    for j in range(n):
                        dst[i][j] = min(dst[i][j], dst[i][p] + dst[p][j])
            res = max(dst[k - 1][j] for j in range(n) if k - 1 != j)
            res = res if res != inf else -1
            return res
    return Solution3,


@app.cell
def __(List, inf):
    class Solution2:
        def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
            k -= 1
            dst = [inf] * n
            dst[k] = 0
            for i in range(n):
                for u, v, w in times:
                    u, v = u - 1, v - 1
                    dst[v] = min(dst[v], dst[u] + w)
            res = max(dst)
            res = res if res != inf else -1
            return res
    return Solution2,


@app.cell
def __():
    from collections import defaultdict
    from heapq import heappop, heappush
    return defaultdict, heappop, heappush


@app.cell
def __(List, defaultdict, heappop, heappush):
    class Solution:
        def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
            g = defaultdict(dict)
            for u, v, w in times:
                u, v = u - 1, v - 1
                g[u][v] = w
            dst, k = {}, k - 1
            h = [(0, k)]
            while h:
                t, u = heappop(h)
                if u not in dst:
                    dst[u] = t
                    for v, w in g[u].items():
                        heappush(h, (t + w, v))
            res = max(dst.values())
            res = res if len(dst) == n else -1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.networkDelayTime([[2,1,1],[2,3,1],[3,4,1]], 4, 2) == 2
    return


@app.cell
def __(sol):
    assert sol.networkDelayTime([[1,2,1]], 2, 1) == 1
    return


@app.cell
def __(sol):
    assert sol.networkDelayTime([[1,2,1]], 2, 2) == -1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
