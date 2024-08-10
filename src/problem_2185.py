import marimo

__generated_with = "0.8.7"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2185](https://leetcode.com/problems/counting-words-with-a-given-prefix)""")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def prefixCount(self, words: List[str], pref: str) -> int:
            res = sum(w.startswith(pref) for w in words)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.prefixCount(["pay","attention","practice","attend"], "at") == 2
    return


@app.cell
def __(sol):
    assert sol.prefixCount(["leetcode","win","loops","success"], "code") == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
