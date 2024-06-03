import marimo

__generated_with = "0.6.13"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(rf"[Problem 3168](https://leetcode.com/problems/minimum-number-of-chairs-in-a-waiting-room)")
    return


@app.cell
def __():
    class Solution:
        def minimumChairs(self, s: str) -> int:
            res = cur = 0
            for c in s:
                cur += 1 if c == "E" else -1
                res = max(res, cur)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumChairs("EEEEEEE") == 7
    return


@app.cell
def __(sol):
    assert sol.minimumChairs("ELELEEL") == 2
    return


@app.cell
def __(sol):
    assert sol.minimumChairs("ELEELEELLL") == 3
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
