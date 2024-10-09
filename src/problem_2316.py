import marimo

__generated_with = "0.9.4"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2316](https://leetcode.com/problems/count-unreachable-pairs-of-nodes-in-an-undirected-graph)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def countPairs(self, n: int, edges: List[List[int]]) -> int:
            class UnionFind:
                def __init__(self, n):
                    self.prnt = list(range(n))
                    self.size = [1] * n

                def find(self, i):
                    if i != self.prnt[i]:
                        self.prnt[i] = self.find(self.prnt[i])
                    return self.prnt[i]

                def union(self, i, j):
                    pi, pj = self.find(i), self.find(j)
                    if pi != pj:
                        if self.size[pi] < self.size[pj]:
                            pi, pj = pj, pi
                        self.prnt[pj] = pi
                        self.size[pi] += self.size[pj]

            uf = UnionFind(n)
            for f, t in edges:
                uf.union(f, t)

            res = sum(n - uf.size[uf.find(i)] for i in range(n)) // 2  # we counted each pair twice
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.countPairs(3, [[0,1],[0,2],[1,2]]) == 0
    return


@app.cell
def __(sol):
    assert sol.countPairs(7, [[0,2],[0,5],[2,4],[1,6],[5,4]]) == 14
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
