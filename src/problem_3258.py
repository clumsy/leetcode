import marimo

__generated_with = "0.8.0"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3258](https://leetcode.com/problems/count-substrings-that-satisfy-k-constraint-i)""")
    return


@app.cell
def __():
    class Solution:
        def countKConstraintSubstrings(self, s: str, k: int) -> int:
            res = b = z = o = 0
            for e, c in enumerate(s):
                z += c == "0"
                o += c == "1"
                while b < e and z > k and o > k:
                    z -= s[b] == "0"
                    o -= s[b] == "1"
                    b += 1
                res += e - b + 1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countKConstraintSubstrings("10101", 1) == 12
    return


@app.cell
def __(sol):
    assert sol.countKConstraintSubstrings("1010101", 2) == 25
    return


@app.cell
def __(sol):
    assert sol.countKConstraintSubstrings("11111", 1) == 15
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
