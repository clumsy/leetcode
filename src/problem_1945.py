import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 1945](https://leetcode.com/problems/sum-of-digits-of-string-after-convert)")
    return


@app.cell
def __():
    class Solution:
        def getLucky(self, s: str, k: int) -> int:
            res = s
            while k:
                res = "".join(c if c < "a" else str(ord(c) - ord("a") + 1) for c in res)
                res = str(sum(int(i) for i in res))
                k -= 1
            return int(res)
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.getLucky("iiii", 1) == 36
    return


@app.cell
def __(sol):
    assert sol.getLucky("leetcode", 2) == 6
    return


@app.cell
def __(sol):
    assert sol.getLucky("zbax", 2) == 8
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
