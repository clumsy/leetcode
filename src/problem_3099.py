import marimo

__generated_with = "0.4.0"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3099](https://leetcode.com/problems/harshad-number)")
    return


@app.cell
def __():
    class Solution:
        def sumOfTheDigitsOfHarshadNumber(self, x: int) -> int:
            s, n = 0, x
            while n:
                n, r = divmod(n, 10)
                s += r
            res = s if x % s == 0 else -1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.sumOfTheDigitsOfHarshadNumber(18) == 9
    return


@app.cell
def __(sol):
    assert sol.sumOfTheDigitsOfHarshadNumber(23) == -1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
