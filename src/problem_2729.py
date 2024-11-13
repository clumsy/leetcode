import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def _(mo):
    mo.md("[Problem 2729](https://leetcode.com/problems/check-if-the-number-is-fascinating)")
    return


@app.cell
def _():
    class Solution:
        def isFascinating(self, n: int) -> bool:
            s = str(n) + str(2*n) + str(3*n)
            res = len(s) == 9 and set(range(1, 10)) == set(int(c) for c in s)
            return res
    return Solution,


@app.cell
def _(Solution):
    sol = Solution()
    return sol,


@app.cell
def _(sol):
    assert sol.isFascinating(192)
    return


@app.cell
def _(sol):
    assert not sol.isFascinating(100)
    return


@app.cell
def _():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()

