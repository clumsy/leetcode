import marimo

__generated_with = "0.5.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3136](https://leetcode.com/problems/valid-word)")
    return


@app.cell
def __():
    import string
    return string,


@app.cell
def __():
    class Solution:
        def isValid(self, w: str) -> bool:
            has_vwl = has_con = False
            valid = len(w) >= 3
            for c in w.lower():
                if not valid:
                    break
                has_vwl |= c in "aieou"
                has_con |= c in "bcdfghjklmnpqrstvwxyz"
                valid = c.isalnum()
            res = valid and has_vwl and has_con
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.isValid("234Adas")
    return


@app.cell
def __(sol):
    assert not sol.isValid("b3")
    return


@app.cell
def __(sol):
    assert not sol.isValid("a3$e")
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
