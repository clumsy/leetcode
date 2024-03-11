import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2437](https://leetcode.com/problems/number-of-valid-clock-times)")
    return


@app.cell
def __():
    class Solution:
        def countTime(self, time: str) -> int:
            res = 1
            if time[-1] == "?":
                res *= 10
            if time[-2] == "?":
                res *= 6
            if time[:2] == "??":
                res *= 24
            elif time[0] == "?":
                res *= 3 if int(time[1]) < 4 else 2
            elif time[1] == "?":
                res *= 10 if int(time[0]) < 2 else 4
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countTime("?5:00") == 2
    return


@app.cell
def __(sol):
    assert sol.countTime("0?:0?") == 100
    return


@app.cell
def __(sol):
    assert sol.countTime("??:??") == 1440
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
