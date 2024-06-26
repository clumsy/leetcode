import marimo

__generated_with = "0.6.23"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 389](https://leetcode.com/problems/find-the-difference)")
    return


@app.cell
def __():
    from collections import Counter
    return Counter,


@app.cell
def __(Counter):
    class Solution:
        def findTheDifference(self, s: str, t: str) -> str:
            res = (Counter(t) - Counter(s)).most_common(1)[0][0]
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.findTheDifference("abcd", "abcde") == "e"
    return


@app.cell
def __(sol):
    assert sol.findTheDifference("", "y") == "y"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
