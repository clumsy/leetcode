import marimo

__generated_with = "0.9.4"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 1653](https://leetcode.com/problems/minimum-deletions-to-make-string-balanced)""")
    return


@app.cell
def __():
    class Solution2:
        def minimumDeletions(self, s: str) -> int:
            res = a = b = 0
            for c in s:
                a += c == "a" if b > 0 else 0
                b += c == "b"
                if a == b:
                    res += b
                    a = b = 0
            res += a if b > 0 else 0
            return res
    return (Solution2,)


@app.cell
def __():
    class Solution:
        def minimumDeletions(self, s: str) -> int:
            res = b = 0
            for c in s:
                if c == "a":
                    res = min(res + 1, b)
                else:
                    b += 1
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.minimumDeletions("aababbab") == 2
    return


@app.cell
def __(sol):
    assert sol.minimumDeletions("bbaaaaabb") == 2
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
