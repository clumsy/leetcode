import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def _(mo):
    mo.md(
        r"""
        [Problem 1009](https://leetcode.com/problems/complement-of-base-10-integer/description)
        """
    )
    return


@app.cell
def _():
    class Solution:
        def bitwiseComplement(self, n: int) -> int:
            mask = 1
            while mask < n:
                mask = (mask << 1) + 1
            # mask is now the smallest 111..111 >= n
            res = mask - n
            return res
    return Solution,


@app.cell
def _(Solution):
    sol = Solution()
    return sol,


@app.cell
def _(sol):
    assert sol.bitwiseComplement(5) == 2
    return


@app.cell
def _(sol):
    assert sol.bitwiseComplement(7) == 0
    return


@app.cell
def _(sol):
    assert sol.bitwiseComplement(10) == 5
    return


@app.cell
def _():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()

