import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 1941](https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences)")
    return


@app.cell
def __():
    from collections import Counter
    return Counter,


@app.cell
def __(Counter):
    class Solution:
        def areOccurrencesEqual(self, s: str) -> bool:
            res = len(set(Counter(s).values())) == 1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.areOccurrencesEqual("abacbc")
    return


@app.cell
def __(sol):
    assert not sol.areOccurrencesEqual("aaabb")
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
