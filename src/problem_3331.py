import marimo

__generated_with = "0.9.14"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3331](https://leetcode.com/problems/find-subtree-sizes-after-changes)""")
    return


@app.cell
def __():
    from typing import List
    from collections import defaultdict
    return List, defaultdict


@app.cell
def __(List, defaultdict):
    class Solution:
        def findSubtreeSizes(self, p: List[int], s: str) -> List[int]:
            n, clds = len(s), defaultdict(set)
            for i in range(n):
                clds[p[i]].add(i)
            res = [0] * n

            def dfs(i, anc={}):
                prv, anc[s[i]] = anc.get(s[i]), i
                res[i] = cnt = 1
                for c in clds[i]:
                    dfs(c, anc)
                    res[p[c]] += res[c]
                anc[s[i]] = prv
                if prv is not None:
                    p[i] = prv

            dfs(0)
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.findSubtreeSizes([-1,0,0,1,1,1], "abaabc") == [6,3,1,1,1,1]
    return


@app.cell
def __(sol):
    assert sol.findSubtreeSizes([-1,0,4,0,1], "abbba") == [5,2,1,1,1]
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
