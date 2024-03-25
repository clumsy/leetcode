import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 357](https://leetcode.com/problems/count-numbers-with-unique-digits)")
    return


@app.cell
def __():
    class Solution:
        def countNumbersWithUniqueDigits(self, n: int) -> int:
            res = 1 if n == 0 else 10
            cnt = 9
            for i in range(1, n):
                cnt *= (10 - i)
                res += cnt
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countNumbersWithUniqueDigits(2) == 91
    return


@app.cell
def __(sol):
    assert sol.countNumbersWithUniqueDigits(0) == 1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
