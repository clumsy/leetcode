import marimo

__generated_with = "0.6.13"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 374](https://leetcode.com/problems/guess-number-higher-or-lower)")
    return


@app.cell
def __():
    value = [0]

    def guess(g):
        if value[0] == g:
            return 0
        else:
            return (value[0] - g) // abs(value[0] - g)
    return guess, value


@app.cell
def __(guess):
    class Solution:
        def guessNumber(self, n: int) -> int:
            lo, hi = 1, n
            while lo <= hi:
                mid = (lo + hi)//2
                res = guess(mid)
                if res == 0:
                    return mid
                elif res > 0:
                    lo = mid + 1
                else:
                    hi = mid - 1
            raise
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol, value):
    value[0] = 6
    assert sol.guessNumber(10) == value[0]
    return


@app.cell
def __(sol, value):
    value[0] = 1
    assert sol.guessNumber(1) == value[0]
    return


@app.cell
def __(sol, value):
    value[0] = 1
    assert sol.guessNumber(2) == value[0]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
