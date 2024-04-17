import marimo

__generated_with = "0.3.12"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3110](https://leetcode.com/problems/score-of-a-string)")
    return


@app.cell
def __():
    class Solution:
        def scoreOfString(self, s: str) -> int:
            res = sum(abs(ord(i) - ord(j)) for i, j in zip(s[1:], s[:-1]))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.scoreOfString("hello") == 13
    return


@app.cell
def __(sol):
    assert sol.scoreOfString("zaz") == 50
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
