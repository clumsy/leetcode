import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def _(mo):
    mo.md("[Problem 1002](https://leetcode.com/problems/find-common-characters)")
    return


@app.cell
def _():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def _(Counter, List):
    class Solution:
        def commonChars(self, words: List[str]) -> List[str]:
            cnt = Counter(words[0])
            for w in words[1:]:
                cnt &= Counter(w)
            res = list(cnt.elements())
            return res
    return Solution,


@app.cell
def _(Solution):
    sol = Solution()
    return sol,


@app.cell
def _(sol):
    assert sol.commonChars(["bella","label","roller"]) == ["e","l","l"]
    return


@app.cell
def _(sol):
    assert sol.commonChars(["cool","lock","cook"]) == ["c","o"]
    return


@app.cell
def _():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()

