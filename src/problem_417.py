import marimo

__generated_with = "0.3.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 417](https://leetcode.com/problems/pacific-atlantic-water-flow)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def pacificAtlantic(self, h: List[List[int]]) -> List[List[int]]:
            m, n = len(h), len(h[0])
            def solve(seen):
                q = [i for i in seen]
                while q:
                    r, c = q.pop()
                    for dr, dc in [(1, 0), (-1, 0), (0, 1), (0, -1)]:
                        r_, c_ = r + dr, c + dc
                        if 0 <= r_ < m and 0 <= c_ < n and h[r_][c_] >= h[r][c] and (r_, c_) not in seen:
                            q.append((r_, c_))
                            seen.add((r_, c_))
                return seen
            a = solve({(m - 1, c) for c in range(n)} | {(r, n - 1) for r in range(m)})
            p = solve({(0, c) for c in range(n)} | {(r, 0) for r in range(m)})
            res = a & p
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.pacificAtlantic([[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]) == set([(0,4),(1,3),(1,4),(2,2),(3,0),(3,1),(4,0)])
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
