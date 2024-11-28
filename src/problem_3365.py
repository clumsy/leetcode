import marimo

__generated_with = "0.9.26"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3365](https://leetcode.com/problems/rearrange-k-substrings-to-form-target-string)""")
    return


@app.cell
def __():
    from collections import Counter
    return (Counter,)


@app.cell
def __(Counter):
    class Solution:
        def isPossibleToRearrange(self, s: str, t: str, k: int) -> bool:
            res, n = False, len(s)
            d, r = divmod(n, k)
            if r == 0:
                cs = Counter([s[i:i + d] for i in range(0, n, d)])
                ct = Counter([t[i:i + d] for i in range(0, n, d)])
                res = cs == ct
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.isPossibleToRearrange("abcd", "cdab", 2)
    return


@app.cell
def __(sol):
    assert sol.isPossibleToRearrange("aabbcc", "bbaacc", 3)
    return


@app.cell
def __(sol):
    assert not sol.isPossibleToRearrange("aabbcc", "bbaacc", 2)
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
