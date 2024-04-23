import marimo

__generated_with = "0.4.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3120](https://leetcode.com/problems/count-the-number-of-special-characters-i)")
    return


@app.cell
def __():
    import string
    from collections import Counter
    return Counter, string


@app.cell
def __(Counter, string):
    class Solution:
        def numberOfSpecialChars(self, word: str) -> int:
            cnt = Counter(word)
            res = sum(cnt[c] > 0 and cnt[c.upper()] > 0 for c in string.ascii_lowercase)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.numberOfSpecialChars("aaAbcBC") == 3
    return


@app.cell
def __(sol):
    assert sol.numberOfSpecialChars("abc") == 0
    return


@app.cell
def __(sol):
    assert sol.numberOfSpecialChars("abBCab") == 1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
