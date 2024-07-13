import marimo

__generated_with = "0.7.9"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"[Problem 3223](https://leetcode.com/problems/minimum-length-of-string-after-operations)")
    return


@app.cell
def __():
    from collections import Counter
    return Counter,


@app.cell
def __(Counter):
    class Solution:
        def minimumLength(self, s: str) -> int:
            cnt = Counter(s)
            res = sum(2 - (c & 1) for c in cnt.values())
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumLength("abaacbcbb") == 5
    return


@app.cell
def __(sol):
    assert sol.minimumLength("aa") == 2
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
