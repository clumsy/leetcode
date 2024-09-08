import marimo

__generated_with = "0.8.19"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2125](https://leetcode.com/problems/number-of-laser-beams-in-a-bank)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def numberOfBeams(self, bank: List[str]) -> int:
            cnt = prv = 0
            for flr in bank:
                c = flr.count('1')
                if c:
                    cnt += prv*c
                    prv = c
            return cnt
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.numberOfBeams(["011001","000000","010100","001000"]) == 8
    return


@app.cell
def __(sol):
    assert sol.numberOfBeams(["000","111","000"]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
