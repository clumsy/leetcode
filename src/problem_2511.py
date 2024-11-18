import marimo

__generated_with = "0.9.20"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2511](https://leetcode.com/problems/maximum-enemy-forts-that-can-be-captured)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def captureForts(self, forts: List[int]) -> int:
            res, s = 0, -1
            for i, e in enumerate(forts):
                if e != 0:
                    if s >= 0 and forts[s] != forts[i]:
                        res = max(res, i - s - 1)
                    s = i
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.captureForts([1,0,0,-1,0,0,0,0,1]) == 4
    return


@app.cell
def __(sol):
    assert sol.captureForts([0,0,1,-1]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
