import marimo

__generated_with = "0.4.0"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3121](https://leetcode.com/problems/count-the-number-of-special-characters-ii)")
    return


@app.cell
def __():
    import string
    return string,


@app.cell
def __(string):
    class Solution:
        def numberOfSpecialChars(self, word: str) -> int:
            lst, fst, n = {}, {}, len(word)
            for i, c in enumerate(word):
                if c.islower():
                    lst[c] = max(lst.get(c, -1), i)
                else:
                    fst[c] = min(fst.get(c, n), i)
            res = sum(lst.get(c, n) < fst.get(c.upper(), -1) for c in string.ascii_lowercase)
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
    assert sol.numberOfSpecialChars("AbBCab") == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
