import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2409](https://leetcode.com/problems/count-days-spent-together)")
    return


@app.cell
def __():
    class Solution:
        def countDaysTogether(self, arriveAlice: str, leaveAlice: str, arriveBob: str, leaveBob: str) -> int:
            days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31]
            def to_num(d):
                m, d = (int(i.lstrip("0")) for i in d.split("-"))
                return sum(days[i] for i in range(m - 1)) + d
            aa, la = to_num(arriveAlice), to_num(leaveAlice)
            ab, lb = to_num(arriveBob), to_num(leaveBob)
            res = max(0, min(la, lb) - max(aa, ab) + 1)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countDaysTogether("08-15", "08-18", "08-16", "08-19") == 3
    return


@app.cell
def __(sol):
    assert sol.countDaysTogether("10-01", "10-31", "11-01", "12-31") == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
