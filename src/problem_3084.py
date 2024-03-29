import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3084](https://leetcode.com/problems/count-substrings-starting-and-ending-with-given-character)")
    return


@app.cell
def __():
    class Solution:
        def countSubstrings(self, s: str, c: str) -> int:
            cnt = s.count(c)
            res = (cnt + 1) * cnt // 2
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countSubstrings("abada", "a") == 6
    return


@app.cell
def __(sol):
    assert sol.countSubstrings("zzz", "z") == 6
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
