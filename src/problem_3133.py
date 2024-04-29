import marimo

__generated_with = "0.4.5"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3133](https://leetcode.com/problems/minimum-array-end)")
    return


@app.cell
def __():
    class Solution:
        def minEnd(self, n: int, x: int) -> int:
            i = j = 0
            msk = n - 1
            res = x
            while msk >= (1 << i):
                if res & (1 << i) == 0:
                    res |= msk & (1 << i)
                else:
                    msk <<= 1
                i += 1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minEnd(3, 4) == 6
    return


@app.cell
def __(sol):
    assert sol.minEnd(2, 7 ) == 15
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
