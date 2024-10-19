import marimo

__generated_with = "0.9.10"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3310](https://leetcode.com/problems/remove-methods-from-project)""")
    return


@app.cell
def __():
    from typing import List
    from collections import defaultdict
    return List, defaultdict


@app.cell
def __(List, defaultdict):
    class Solution:
        def remainingMethods(self, n: int, k: int, invs: List[List[int]]) -> List[int]:
            clls = defaultdict(list)
            for f, t in invs:
                clls[f].append(t)

            sus = set()
            def dfs(i):
                if i in sus:
                    return
                sus.add(i)
                for t in clls[i]:
                    dfs(t)
            dfs(k)

            for f in range(n):
                if f not in sus and any(t in sus for t in clls[f]):
                    res = [i for i in range(n)]
                    break
            else:
                res = [i for i in range(n) if i not in sus]
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.remainingMethods(4, 1, [[1,2],[0,1],[3,2]]) == [0,1,2,3]
    return


@app.cell
def __(sol):
    assert sol.remainingMethods(5, 0, [[1,2],[0,2],[0,1],[3,4]]) == [3,4]
    return


@app.cell
def __(sol):
    assert sol.remainingMethods(3, 2, [[1,2],[0,1],[2,0]]) == []
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
