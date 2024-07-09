import marimo

__generated_with = "0.7.8"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"[Problem 3211](https://leetcode.com/problems/generate-binary-strings-without-adjacent-zeros)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def validStrings(self, n: int) -> List[str]:
            res = [""]
            for _ in range(n):
                nxt = []
                for e in res:
                    if not e or e[-1] == "1":
                        nxt.append(e + "0")
                    nxt.append(e + "1")
                res = nxt
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.validStrings(3) == ["010","011","101","110","111"]
    return


@app.cell
def __(sol):
    assert sol.validStrings(1) == ["0","1"]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
