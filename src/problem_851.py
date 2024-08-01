import marimo

__generated_with = "0.7.20"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 851](https://leetcode.com/problems/loud-and-rich)""")
    return


@app.cell
def __():
    from typing import List
    from collections import defaultdict
    return List, defaultdict


@app.cell
def __(List, defaultdict):
    class Solution:
        def loudAndRich(self, richer: List[List[int]], quiet: List[int]) -> List[int]:

            # build graph
            richer_than = defaultdict(set)
            for r, b in richer:
                richer_than[b].add(r)

            # topological sort
            ord, seen = [], set()
            def dfs(i):
                if i in seen:
                    return
                seen.add(i)
                for j in richer_than[i]:
                    dfs(j)
                ord.append(i)
            n = len(quiet)
            for i in range(n):
                dfs(i)
            
            res = [-1] * n
            for i in range(n):
                res[ord[i]] = ord[i]
                for j in richer_than[ord[i]]:
                    if quiet[res[j]] < quiet[res[ord[i]]]:
                        res[ord[i]] = res[j]

            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.loudAndRich([[1,0],[2,1],[3,1],[3,7],[4,3],[5,3],[6,3]], [3,2,5,4,6,1,7,0]) == [5,5,2,5,4,5,6,7]
    return


@app.cell
def __(sol):
    assert sol.loudAndRich([], [0]) == [0]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
