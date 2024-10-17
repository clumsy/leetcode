import marimo

__generated_with = "0.9.10"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2396](https://leetcode.com/problems/strictly-palindromic-number)""")
    return


@app.cell
def __():
    class Solution:
        def isStrictlyPalindromic(self, n: int) -> bool:
            # n in base n - 2 is always 12
            return False
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert not sol.isStrictlyPalindromic(9)
    return


@app.cell
def __(sol):
    assert not sol.isStrictlyPalindromic(4)
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
