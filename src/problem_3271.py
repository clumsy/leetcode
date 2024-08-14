import marimo

__generated_with = "0.8.13"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3271](https://leetcode.com/problems/hash-divided-string)""")
    return


@app.cell
def __():
    class Solution:
        def stringHash(self, s: str, k: int) -> str:
            def hash(c):
                return chr(ord("a") + sum(ord(i) - ord("a") for i in c) % 26)
            res = "".join(hash(s[i * k:(i + 1) * k]) for i in range(len(s) // k))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.stringHash("abcd", 2) == "bf"
    return


@app.cell
def __(sol):
    assert sol.stringHash("mxz", 3) == "i"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
