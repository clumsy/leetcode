import marimo

__generated_with = "0.8.15"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 1284](https://leetcode.com/problems/minimum-number-of-flips-to-convert-binary-matrix-to-zero-matrix)""")
    return


@app.cell
def __():
    from typing import List
    from collections import deque
    return List, deque


@app.cell
def __(List, deque):
    class Solution:
        def minFlips(self, mat: List[List[int]]) -> int:
            m, n = len(mat), len(mat[0])
            vst = set()
            b = 0
            for r in range(m):
                for c in range(n):
                    b |= 1 << (r * n + c) if mat[r][c] == 1 else 0
            q = deque([b])

            def flip_cell(s, r, c):
                i = r * n + c
                s ^= 1 << i
                if i - n >= 0:
                    s ^= 1 << (i - n)
                if i + n < m * n:
                    s ^= 1 << (i + n)
                if c != 0 and i - 1 >= 0:
                    s ^= 1 << (i - 1)
                if c != n - 1 and i + 1 < m * n:
                    s ^= 1 << (i + 1)
                return s

            res, done = 0, False
            while q:
                for _ in range(len(q)):
                    cur = q.pop()
                    if cur == 0:
                        done = True
                        break
                    for r in range(m):
                        for c in range(n):
                            s = flip_cell(cur, r, c)
                            if s not in vst:
                                vst.add(s)
                                q.appendleft(s)
                if done:
                    break
                res += 1
            else:
                res = -1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minFlips([[0,0],[0,1]]) == 3
    return


@app.cell
def __(sol):
    assert sol.minFlips([[0]]) == 0
    return


@app.cell
def __(sol):
    assert sol.minFlips([[1,0,0],[1,0,0]]) == -1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
