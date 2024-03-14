import marimo

__generated_with = "0.3.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2427](https://leetcode.com/problems/number-of-common-factors)")
    return


@app.cell
def __():
    class Solution:
        def commonFactors(self, a: int, b: int) -> int:
            def gcd(a, b):
                return a if b == 0 else gcd(b, a % b)
            res, i, g = 0, 1, gcd(a, b)
            while i * i <= g:
                j = g // i
                if i * j == g:
                    res += 1 + (j != i)
                i += 1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.commonFactors(12, 6) == 4
    return


@app.cell
def __(sol):
    assert sol.commonFactors(25, 30) == 2
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
