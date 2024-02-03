import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3019](https://leetcode.com/problems/number-of-changing-keys/description)")
    return


@app.cell
def __():
    class Solution:
        def countKeyChanges(self, s: str) -> int:
            res = sum(c1.lower() != c2.lower() for c1, c2 in zip(s, s[1:]))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countKeyChanges("aAbBcC") == 2
    return


@app.cell
def __(sol):
    assert sol.countKeyChanges("AaAaAaaA") == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
