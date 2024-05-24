import marimo

__generated_with = "0.6.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2368](https://leetcode.com/problems/reachable-nodes-with-restrictions)")
    return


@app.cell
def __():
    from typing import List
    from collections import defaultdict
    return List, defaultdict


@app.cell
def __(List, defaultdict):
    class Solution:
        def reachableNodes(self, n: int, e: List[List[int]], r: List[int]) -> int:
            g = defaultdict(list)
            for f, t in e:
                g[f].append(t)
                g[t].append(f)
            seen, q = {0}, [0]
            res, r = 0, set(r)
            while q:
                t = q.pop()
                res += 1
                for n in g[t]:
                    if n not in seen and n not in r:
                        seen.add(n)
                        q.append(n)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.reachableNodes(7, [[0,1],[1,2],[3,1],[4,0],[0,5],[5,6]], [4,5]) == 4
    return


@app.cell
def __(sol):
    assert sol.reachableNodes(7, [[0,1],[0,2],[0,5],[0,4],[3,2],[6,5]], [4,2,1]) == 3
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
