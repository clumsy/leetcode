import marimo

__generated_with = "0.6.14"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(rf"[Problem 3143](https://leetcode.com/problems/maximum-points-inside-the-square)")
    return


@app.cell
def __():
    from math import inf
    from typing import List
    from collections import defaultdict
    return List, defaultdict, inf


@app.cell
def __(List, defaultdict, inf):
    class Solutio2:
        def maxPointsInsideSquare(self, p: List[List[int]], s: str) -> int:
            ma, cnt = inf, defaultdict(set)
            for i in range(len(p)):
                v = max(abs(v) for v in p[i])
                if s[i] in cnt[v]:
                    ma = min(ma, v)
                    del cnt[v]
                if v < ma:
                    cnt[v].add(s[i])
            for i in list(cnt.keys()):
                if i >= ma:
                    del cnt[i]
            res, unq = 0, set()
            for i in sorted(cnt.keys()):
                if unq & cnt[i]:
                    break
                unq |= cnt[i]
            res = len(unq)
            return res
    return Solutio2,


@app.cell
def __(List, inf):
    class Solution:
        def maxPointsInsideSquare(self, p: List[List[int]], s: str) -> int:
            ma, fst = inf, {}
            for i in range(len(p)):
                v = max(abs(v) for v in p[i])
                ma = min(ma, max(v, fst.get(s[i], inf)))
                if v < ma:
                    fst[s[i]] = v
            res = sum(v < ma for v in fst.values())
            return res

    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maxPointsInsideSquare([[2,2],[-1,-2],[-4,4],[-3,1],[3,-3]], "abdca") == 2
    return


@app.cell
def __(sol):
    assert sol.maxPointsInsideSquare([[1,1],[-2,-2],[-2,2]], "abb") == 1
    return


@app.cell
def __(sol):
    assert sol.maxPointsInsideSquare([[1,1],[-1,-1],[2,-2]], "ccd") == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
