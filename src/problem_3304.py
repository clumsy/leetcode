import marimo

__generated_with = "0.6.17"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(rf"[Problem 3304](https://leetcode.com/problems/find-the-k-th-character-in-string-game-i)")
    return


@app.cell
def __():
    class Solution:
        def kthCharacter(self, k: int) -> str:
            s = "a"
            while len(s) < k:
                s = s + "".join(chr(ord(c) + 1) for c in s)
            res = s[k - 1]
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.kthCharacter(5) == "b"
    return


@app.cell
def __(sol):
    assert sol.kthCharacter(10) == "c"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
