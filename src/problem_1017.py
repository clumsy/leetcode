import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 1017](https://leetcode.com/problems/convert-to-base-2)")
    return


@app.cell
def __():
    class Solution:
        def baseNeg2(self, n: int) -> str:
            res = []
            while n != 0:
                n, r = divmod(n, 2)
                n *= -1
                res.append(str(r))
            res = "".join(res[::-1] or ["0"])
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.baseNeg2(2) == "110"
    return


@app.cell
def __(sol):
    assert sol.baseNeg2(3) == "111"
    return


@app.cell
def __(sol):
    assert sol.baseNeg2(4) == "100"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
