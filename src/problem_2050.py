import marimo

__generated_with = "0.8.20"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 2050](https://leetcode.com/problems/parallel-courses-iii)""")
    return


@app.cell
def __():
    from typing import List
    from collections import defaultdict
    return List, defaultdict


@app.cell
def __(List, defaultdict):
    class Solution:
        def minimumTime(self, n: int, rs: List[List[int]], time: List[int]) -> int:
            in_deg = defaultdict(int)
            deps = defaultdict(list)
            for f, t in rs:
                deps[f - 1].append(t - 1)
                in_deg[t - 1] += 1
            q = [i for i in range(n) if in_deg[i] == 0]
            ts = time.copy()
            res = 0
            while q:
                f = q.pop()
                res = max(res, ts[f])
                for t in deps[f]:
                    ts[t] = max(ts[t], ts[f] + time[t])
                    in_deg[t] -= 1
                    if in_deg[t] == 0:
                        q.append(t)
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.minimumTime(3, [[1,3],[2,3]], [3,2,5]) == 8
    return


@app.cell
def __(sol):
    assert sol.minimumTime(5, [[1,5],[2,5],[3,5],[3,4],[4,5]], [1,2,3,4,5]) == 12
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
