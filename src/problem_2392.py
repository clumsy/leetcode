import marimo

__generated_with = "0.8.15"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 2392](https://leetcode.com/problems/build-a-matrix-with-conditions)""")
    return


@app.cell
def __():
    from typing import List
    from collections import defaultdict
    return List, defaultdict


@app.cell
def __(List, defaultdict):
    class Solution:
        def buildMatrix(self, k: int, rc: List[List[int]], cc: List[List[int]]) -> List[List[int]]:
            def dfs(nxt, state, i, ord):
                if state[i] > 0:
                    return state[i] == 2
                state[i] = 1
                for c in nxt[i]:
                    if not dfs(nxt, state, c, ord):
                        return False
                state[i] = 2
                ord.append(i)
                return True

            def topo(nxt):
                ord, state = [], [0] * k
                for i in range(k):
                    if state[i] == 0 and not dfs(nxt, state, i, ord):
                        return []
                res = [-1] * k
                for i, c in enumerate(ord[::-1]):
                    res[c] = i
                return res

            def format(lst):
                res = defaultdict(set)
                for f, s in lst:
                    res[f - 1].add(s - 1)
                return res

            if (rows := topo(format(rc))) and (cols := topo(format(cc))):
                res = [[0] * k for _ in range(k)]
                for i, (r, c) in enumerate(zip(rows, cols)):
                    res[r][c] = i + 1
            else:
                res = []
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.buildMatrix(3, [[1,2],[3,2]], [[2,1],[3,2]]) == [[3,0,0],[0,0,1],[0,2,0]]
    return


@app.cell
def __(sol):
    assert sol.buildMatrix(3, [[1,2],[2,3],[3,1],[2,3]], [[2,1]]) == []
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
