import marimo

__generated_with = "0.7.5"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"[Problem 3210](https://leetcode.com/problems/find-the-encrypted-string)")
    return


@app.cell
def __():
    class Solution:
        def getEncryptedString(self, s: str, k: int) -> str:
            k %= len(s)
            res = s[k:] + s[:k]
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.getEncryptedString("dart", 3) == "tdar"
    return


@app.cell
def __(sol):
    assert sol.getEncryptedString("aaa", 1) == "aaa"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
