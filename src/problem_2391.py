import marimo

__generated_with = "0.9.11"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2391](https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def garbageCollection(self, garbage: List[str], travel: List[int]) -> int:
            res, last = 0, {}
            for i, s in enumerate(garbage):
                res += len(s)
                for c in s:
                    last[c] = i
            for i, s in enumerate(garbage):
                left = sum(j > i for j in last.values())
                if not left:
                    break
                # how many trucks need to keep going to next houses
                res += left * travel[i] if i < len(travel) else 0
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.garbageCollection(["G","P","GP","GG"], [2,4,3]) == 21
    return


@app.cell
def __(sol):
    assert sol.garbageCollection(["MMM","PGM","GP"], [3, 10]) == 37
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
