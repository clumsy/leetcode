import marimo

__generated_with = "0.7.19"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3249](https://leetcode.com/problems/count-the-number-of-good-nodes)""")
    return


@app.cell
def __():
    from math import inf
    from typing import List
    from collections import defaultdict
    return List, defaultdict, inf


@app.cell
def __(List, defaultdict, inf):
    class Solution:
        def countGoodNodes(self, edges: List[List[int]]) -> int:
            e = defaultdict(list)
            for a, b in edges:
                e[a].append(b)
                e[b].append(a)
            self.res = 0
            def solve(c, p=None):
                cnt, mi, ma = 0, inf, -inf
                for n in e[c]:
                    if n == p:
                        continue
                    cur = solve(n, c) + 1
                    cnt += cur
                    mi = min(mi, cur)
                    ma = max(ma, cur)
                if mi == ma or cnt == 0:
                    self.res += 1
                return cnt
            solve(0)
            return self.res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countGoodNodes([[0,1],[0,2],[1,3],[1,4],[2,5],[2,6]]) == 7
    return


@app.cell
def __(sol):
    assert sol.countGoodNodes([[0,1],[1,2],[2,3],[3,4],[0,5],[1,6],[2,7],[3,8]]) == 6
    return


@app.cell
def __(sol):
    assert sol.countGoodNodes([[0,1],[1,2],[1,3],[1,4],[0,5],[5,6],[6,7],[7,8],[0,9],[9,10],[9,12],[10,11]]) == 12
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
