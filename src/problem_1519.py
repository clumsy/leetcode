import marimo

__generated_with = "0.3.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 1519](https://leetcode.com/problems/number-of-nodes-in-the-sub-tree-with-the-same-label)")
    return


@app.cell
def __():
    from typing import List
    from collections import defaultdict
    return List, defaultdict


@app.cell
def __(List, defaultdict):
    class Solution:
        def countSubTrees(self, n: int, edges: List[List[int]], labels: str) -> List[int]:
            inc = [[] for _ in range(n)]
            for f, t in edges:
                inc[f].append(t)
                inc[t].append(f)
            def dfs(res, prv, cur):
                cnt = defaultdict(int)
                cnt[labels[cur]] += 1
                for e in inc[cur]:
                    if e != prv:
                        for c, v in dfs(res, cur, e).items():
                            cnt[c] += v
                res[cur] = cnt[labels[cur]]
                return cnt
            res = [0] * n
            dfs(res, 0, 0)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countSubTrees(7, [[0,1],[0,2],[1,4],[1,5],[2,3],[2,6]], "abaedcd") == [2,1,1,1,1,1,1]
    return


@app.cell
def __(sol):
    assert sol.countSubTrees(4, [[0,1],[1,2],[0,3]], "bbbb") == [4,2,1,1]
    return


@app.cell
def __(sol):
    assert sol.countSubTrees(5, [[0,1],[0,2],[1,3],[0,4]], "aabab") == [3,2,1,1,1]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
