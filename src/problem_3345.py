import marimo

__generated_with = "0.9.17"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3345](https://leetcode.com/problems/smallest-divisible-digit-product-i)""")
    return


@app.cell
def __():
    class Solution:
        def smallestNumber(self, n: int, t: int) -> int:
            while True:
                p = 1
                for c in str(n):
                    p *= int(c)
                if p % t == 0:
                    res = n
                    break
                n += 1
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.smallestNumber(10, 2) == 10
    return


@app.cell
def __(sol):
    assert sol.smallestNumber(15, 3) == 16
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
