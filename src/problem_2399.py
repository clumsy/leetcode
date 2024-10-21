import marimo

__generated_with = "0.9.11"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2399](https://leetcode.com/problems/check-distances-between-same-letters)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def checkDistances(self, s: str, distance: List[int]) -> bool:
            n = len(s)
            pos = sorted(range(n), key=s.__getitem__)
            for i in range(0, n, 2):
                if abs(pos[i] - pos[i + 1]) - 1 != distance[ord(s[pos[i]]) - ord("a")]:
                    return False
            return True
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.checkDistances("abaccb", [1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0])
    return


@app.cell
def __(sol):
    assert not sol.checkDistances("aa", [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0])
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
