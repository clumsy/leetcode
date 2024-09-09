import marimo

__generated_with = "0.8.19"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 2642](https://leetcode.com/problems/design-graph-with-shortest-path-calculator)""")
    return


@app.cell
def __():
    from collections import defaultdict, deque
    from math import inf
    return defaultdict, deque, inf


@app.cell
def __(List, inf):
    class Graph2:
        def __init__(self, n: int, edgs: List[List[int]]):
            self.dist = [[inf if i != j else 0 for j in range(n)] for i in range(n)]
            for f, t, c in edgs:
                self.dist[f][t] = min(self.dist[f][t], c)
            for k in range(n):
                for i in range(n):
                    if self.dist[i][k] < inf:
                        for j in range(n):
                            self.dist[i][j] = min(self.dist[i][j], self.dist[i][k] + self.dist[k][j])

        def addEdge(self, e: List[int]) -> None:
            f, t, c = e
            if self.dist[f][t] <= c:
                return
            self.dist[f][t] = c
            n = len(self.dist)
            for u in range(n):
                for v in range(n):
                    self.dist[u][v] = min(self.dist[u][v], self.dist[u][f] + c + self.dist[t][v])

        def shortestPath(self, n1: int, n2: int) -> int:
            res = self.dist[n1][n2]
            res = res if res != inf else -1
            return res
    return (Graph2,)


@app.cell
def __(List, defaultdict, deque, inf):
    class Graph:
        def __init__(self, n: int, edgs: List[List[int]]):
            self.edg = defaultdict(dict)
            for e in edgs:
                self.addEdge(e)
            self.n = n

        def addEdge(self, e: List[int]) -> None:
            u, v, c = e
            self.edg[u][v] = c

        def shortestPath(self, n1: int, n2: int) -> int:
            q = deque([n1])
            d = [inf] * self.n
            d[n1] = 0
            while q:
                u = q.popleft()
                for v, c in self.edg[u].items():
                    if d[v] > d[u] + c:
                        d[v] = d[u] + c
                        q.append(v)
            res = d[n2] if d[n2] != inf else -1
            return res
    return (Graph,)


@app.cell
def __(Graph):
    sol = Graph(4, [[0, 2, 5], [0, 1, 2], [1, 2, 1], [3, 0, 3]])
    assert sol.shortestPath(3, 2) == 6
    assert sol.shortestPath(0, 3) == -1
    sol.addEdge([1, 3, 4])
    assert sol.shortestPath(0, 3) == 6
    return (sol,)


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
