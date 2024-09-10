import marimo

__generated_with = "0.8.19"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2120](https://leetcode.com/problems/execution-of-all-suffix-instructions-staying-in-a-grid)""")
    return


@app.cell
def __():
    from typing import List
    from collections import defaultdict
    return List, defaultdict


@app.cell
def __(defaultdict):
    class Solution:
        def executeInstructions(self, n, start, s):
            m = len(s)
            (x0, y0), (x, y) = start, (0, 0)
            res = list(range(m, 0, -1))
            count = defaultdict(set)
            count[x0, None].add(0)
            count[None, y0].add(0)
            for i in range(m):
                if s[i] == 'L': y -= 1
                if s[i] == 'R': y += 1
                if s[i] == 'U': x -= 1
                if s[i] == 'D': x += 1
                count[x0 - x, None].add(i + 1)
                count[None, y0 - y].add(i + 1)
                for key in [(n - x, None), (None, n - y), (-x - 1, None), (None, -y - 1)]:
                    for j in count[key]:
                        res[j] = min(res[j], i - j)
                    del count[key]
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.executeInstructions(3, [0, 1], "RRDDLU") == [1,5,4,3,1,0]
    return


@app.cell
def __(sol):
    assert sol.executeInstructions(2, [1, 1], "LURD") == [4,1,0,0]
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
