import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 802](https://leetcode.com/problems/find-eventual-safe-states)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def eventualSafeNodes(self, graph: List[List[int]]) -> List[int]:
            res, done = [], {}
            def dfs(i):
                if i in done:
                    return done[i]
                done[i] = False
                for j in graph[i]:
                    if not dfs(j):
                        return False
                done[i] = True
                return True
            for i in range(len(graph)):
                if dfs(i):
                    res.append(i)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.eventualSafeNodes([[1,2],[2,3],[5],[0],[5],[],[]]) == [2,4,5,6]
    return


@app.cell
def __(sol):
    assert sol.eventualSafeNodes([[1,2,3,4],[1,2],[3,4],[0,4],[]]) == [4]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
