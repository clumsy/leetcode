import marimo

__generated_with = "0.4.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2027](https://leetcode.com/problems/minimum-moves-to-convert-string)")
    return


@app.cell
def __():
    class Solution:
        def minimumMoves(self, s: str) -> int:
            res = i = 0
            while i < len(s):
                if s[i] == "X":
                    res += 1
                    i += 3
                else:
                    i += 1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumMoves("XXX") == 1
    return


@app.cell
def __(sol):
    assert sol.minimumMoves("XXOX") == 2
    return


@app.cell
def __(sol):
    assert sol.minimumMoves("OOOO") == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
