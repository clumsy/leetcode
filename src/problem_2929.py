import marimo

__generated_with = "0.9.20"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 2929](https://leetcode.com/problems/distribute-candies-among-children-ii)""")
    return


@app.cell
def __():
    class Solution2:
        def distributeCandies(self, n: int, limit: int) -> int:
            res = 0
            if n <= 3 * limit:
                for i in range(max(0, n - 2 * limit), min(n, limit) + 1):
                    r, l = min(limit, n - i), max(0, n - i - limit)
                    res += r + 1 - l
            return res
    return (Solution2,)


@app.cell
def __():
    from math import comb
    return (comb,)


@app.cell
def __(comb):
    class Solution:
        def distributeCandies(self, n: int, limit: int) -> int:
            sgn, res = 1, 0
            for i in range(4):
                if (n_ := n - i * (limit + 1) + 2) <= 0:
                    break
                res += sgn * comb(3, i) * comb(n_, 2)
                sgn *= -1
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.distributeCandies(5, 2) == 3
    return


@app.cell
def __(sol):
    assert sol.distributeCandies(3, 3) == 10
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
