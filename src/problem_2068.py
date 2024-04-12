import marimo

__generated_with = "0.3.12"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2068](https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent)")
    return


@app.cell
def __():
    from collections import Counter
    return Counter,


@app.cell
def __(Counter):
    class Solution:
        def checkAlmostEquivalent(self, word1: str, word2: str) -> bool:
            c1, c2 = (Counter(w) for w in (word1, word2))
            diff = (c1 - c2) | (c2 - c1)
            res = all(c <= 3 for c in diff.values())
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert not sol.checkAlmostEquivalent("aaaa", "bccb")
    return


@app.cell
def __(sol):
    assert sol.checkAlmostEquivalent("abcdeef", "abaaacc")
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
