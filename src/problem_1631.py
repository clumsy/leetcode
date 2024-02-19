import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 1631](https://leetcode.com/problems/path-with-minimum-effort)")
    return


@app.cell
def __():
    from typing import List
    from heapq import heappop, heappush
    from math import inf
    return List, heappop, heappush, inf


@app.cell
def __(List):
    class Solution2:
        def minimumEffortPath(self, h: List[List[int]]) -> int:
            rs, cs = len(h), len(h[0])
            
            def dfs(m):
                q = [(0, 0)]
                seen = set()
                while q:
                    r, c = q.pop()
                    if r == rs - 1 and c == cs - 1:
                        return True
                    for dr, dc in [(-1, 0), (+1, 0), (0, -1), (0, +1)]:
                        r_, c_ = r + dr, c + dc
                        if 0 <= r_ < rs and 0 <= c_ < cs and abs(h[r][c] - h[r_][c_]) <= m and (r_, c_) not in seen:
                            seen.add((r_, c_))
                            q.append((r_, c_))
                return False

            lo, hi = 0, max(h[r][c] for r in range(rs) for c in range(cs))
            while lo < hi:
                mi = lo + (hi - lo) // 2
                if dfs(mi):
                    hi = mi
                else:
                    lo = mi + 1
            res = lo
            return res
    return Solution2,


@app.cell
def __(List, heappop, heappush, inf):
    class Solution:
        def minimumEffortPath(self, h: List[List[int]]) -> int:
            rs, cs = len(h), len(h[0])
            q, dst = [(0, 0, 0)], [[inf] * cs for _ in range(rs)]
            dst[0][0] = 0
            while q:
                res, r, c = heappop(q)
                if r == rs - 1 and c == cs - 1:
                    break
                if res > dst[r][c]:
                    continue
                for dr, dc in [(-1, 0), (+1, 0), (0, -1), (0, +1)]:
                    r_, c_ = r + dr, c + dc
                    if 0 <= r_ < rs and 0 <= c_ < cs:
                        m_ = max(res, abs(h[r][c] - h[r_][c_]))
                        if m_ < dst[r_][c_]:
                            dst[r_][c_] = m_
                            heappush(q, (m_, r_, c_))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumEffortPath([[1,2,2],[3,8,2],[5,3,5]]) == 2
    return


@app.cell
def __(sol):
    assert sol.minimumEffortPath([[1,2,3],[3,8,4],[5,3,5]]) == 1
    return


@app.cell
def __(sol):
    assert sol.minimumEffortPath([[1,2,1,1,1],[1,2,1,2,1],[1,2,1,2,1],[1,2,1,2,1],[1,1,1,2,1]]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
