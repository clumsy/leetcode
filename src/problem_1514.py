import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 1514](https://leetcode.com/problems/path-with-maximum-probability)")
    return


@app.cell
def __():
    from typing import List
    from heapq import heappush, heappop
    from collections import defaultdict
    return List, defaultdict, heappop, heappush


@app.cell
def __(List, defaultdict, heappop, heappush):
    class Solution3:
        def maxProbability(self, n: int, e: List[List[int]], p: List[float], srt: int, end: int) -> float:
            m = defaultdict(list)
            for i, (f, t) in enumerate(e):
                m[f].append(i)
                m[t].append(i)
            q = [(-1, srt)]
            seen = set()
            res = 0
            while q:
                for _ in range(len(q)):
                    v, i = heappop(q)
                    if i == end:
                        res = max(res, -v)
                    for j in m[i]:
                        if j not in seen:
                            seen.add(j)
                            t = e[j][0] if e[j][1] == i else e[j][1]
                            heappush(q, (v * p[j], t))
            return res
    return Solution3,


@app.cell
def __(List, defaultdict, deque):
    class Solution2:
        def maxProbability(self, n: int, e: List[List[int]], p: List[float], srt: int, end: int) -> float:
            prb, g = [0] * n, defaultdict(list)
            for i, (f, t) in enumerate(e):
                g[f].append((t, i))
                g[t].append((f, i))
            prb[srt] = 1
            q = deque([srt])
            while q:
                cur = q.popleft()
                for u, i in g[cur]:
                    if prb[cur] * p[i] > prb[u]:
                        prb[u] = prb[cur] * p[i]
                        q.append(u)
            res = prb[end]
            return res
    return Solution2,


@app.cell
def __(List, defaultdict, heappop, heappush):
    class Solution:
        def maxProbability(self, n: int, e: List[List[int]], p: List[float], srt: int, end: int) -> float:
            prb, g = [0] * n, defaultdict(list)
            for i, (f, t) in enumerate(e):
                g[f].append((t, i))
                g[t].append((f, i))
            prb[srt] = 1
            q = [(-prb[srt], srt)]
            res = 0
            while q and res == 0:
                v, cur = heappop(q)
                if cur == end:
                    res = -v
                    break
                for u, i in g[cur]:
                    if -v * p[i] > prb[u]:
                        prb[u] = -v * p[i]
                        heappush(q, (-prb[u], u))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maxProbability(3, [[0,1],[1,2],[0,2]], [0.5,0.5,0.2], 0, 2) == 0.25
    return


@app.cell
def __(sol):
    assert sol.maxProbability(3, [[0,1],[1,2],[0,2]], [0.5,0.5,0.3], 0, 2) == 0.3
    return


@app.cell
def __(sol):
    assert sol.maxProbability(3, [[0,1]], [0.5], 0, 2) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
