import marimo

__generated_with = "0.3.8"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3096](https://leetcode.com/problems/minimum-levels-to-gain-more-points)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def minimumLevels(self, p: List[int]) -> int:
            res, dan, bob = -1, 0, sum(1 if i > 0 else -1 for i in p)
            for i, e in enumerate(p[:-1]):
                d = 1 if e > 0 else -1
                dan += d
                bob -= d
                if dan > bob:
                    res = i + 1
                    break
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumLevels([1,0,1,0]) == 1
    return


@app.cell
def __(sol):
    assert sol.minimumLevels([1,1,1,1,1]) == 3
    return


@app.cell
def __(sol):
    assert sol.minimumLevels([0,0]) == -1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
