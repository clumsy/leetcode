import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2481](https://leetcode.com/problems/minimum-cuts-to-divide-a-circle)")
    return


@app.cell
def __():
    class Solution:
        def numberOfCuts(self, n: int) -> int:
            res = 0 if n == 1 else n if n & 1 == 1 else n // 2
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.numberOfCuts(4) == 2
    return


@app.cell
def __(sol):
    assert sol.numberOfCuts(3) == 3
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
