import marimo

__generated_with = "0.9.14"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2373](https://leetcode.com/problems/largest-local-values-in-a-matrix)""")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    from heapq import heapify, heappush, heappop
    return Counter, List, heapify, heappop, heappush


@app.cell
def __(Counter, List, heapify, heappop, heappush):
    class Solution:
        def largestLocal(self, grid: List[List[int]]) -> List[List[int]]:
            n = len(grid)
            res = [[0 for _ in range(n - 2)] for _ in range(n - 2)]
            for r in range(n - 2):
                h = [-grid[i][j] for i in range(r, r + 3) for j in range(3)]
                heapify(h)
                cnt = Counter(h)
                res[r][0] = -h[0]
                for c in range(1, n - 2):
                    for k in range(3):
                        cnt[-grid[r + k][c - 1]] -= 1
                    for k in range(3):
                        v = -grid[r + k][c + 2]
                        cnt[v] += 1
                        if cnt[v] == 1:
                            heappush(h, v)
                    while cnt[h[0]] == 0:
                        heappop(h)
                    res[r][c] = -h[0]
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.largestLocal([[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]) == [[9,9],[8,6]]
    return


@app.cell
def __(sol):
    assert sol.largestLocal([[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]) == [[2,2,2],[2,2,2],[2,2,2]]
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
