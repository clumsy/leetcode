import marimo

__generated_with = "0.7.9"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"[Problem 3228](https://leetcode.com/problems/maximum-number-of-operations-to-move-ones-to-the-end)")
    return


@app.cell
def __():
    class Solution:
        def maxOperations(self, s: str) -> int:
            res = o = 0
            for i, c in enumerate(s + "1"):
                if c == "1":
                    if i > 0 and s[i - 1] == "0":
                        res += o
                    o += 1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maxOperations("1001101") == 4
    return


@app.cell
def __(sol):
    assert sol.maxOperations("00111") == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
