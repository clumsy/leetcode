import marimo

__generated_with = "0.8.13"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3275](https://leetcode.com/problems/k-th-nearest-obstacle-queries)""")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution2:
        def resultsArray(self, q: List[List[int]], k: int) -> List[int]:
            res = [-1] * len(q)
            n = len(q)
            def sm(x, y):
                return abs(x) + abs(y)
            ord = sorted(range(n), key=lambda i: (sm(*q[i]), -i), reverse=True)
            hi = n - k
            for i in reversed(range(k - 1, n)):
                res[i] = sm(*q[ord[hi]])
                if sm(*q[i]) <= res[i]:
                    hi -= 1
                while hi >= 0 and ord[hi] >= i:
                    hi -= 1
            return res
    return Solution2,


@app.cell
def __():
    from heapq import heappop, heappush
    return heappop, heappush


@app.cell
def __(List, heappop, heappush):
    class Solution:
        def resultsArray(self, q: List[List[int]], k: int) -> List[int]:
            res = [-1] * len(q)
            n = len(q)
            def sm(x, y):
                return abs(x) + abs(y)
            h = []
            for i in range(n):
                heappush(h, -sm(*q[i]))
                if len(h) > k:
                    heappop(h)
                if len(h) == k:
                    res[i] = -h[0]
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.resultsArray([[1,2],[3,4],[2,3],[-3,0]], 2) == [-1,7,5,3]
    return


@app.cell
def __(sol):
    assert sol.resultsArray([[5,5],[4,4],[3,3]], 1) == [10,8,6]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
