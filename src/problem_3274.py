import marimo

__generated_with = "0.8.7"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3274](https://leetcode.com/problems/check-if-two-chessboard-squares-have-the-same-color)""")
    return


@app.cell
def __():
    class Solution:
        def checkTwoChessboards(self, c1: str, c2: str) -> bool:
            def parity(s):
                return ((ord(s[0]) - ord("a") + 1) + int(s[1])) & 1
            res = parity(c1) == parity(c2)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.checkTwoChessboards("a1", "c3")
    return


@app.cell
def __(sol):
    assert not sol.checkTwoChessboards("a1", "h3")
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
