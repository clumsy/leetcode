import marimo

__generated_with = "0.6.24"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 392](https://leetcode.com/problems/is-subsequence)")
    return


@app.cell
def __():
    class Solution:
        def isSubsequence(self, s: str, t: str) -> bool:
            i = j = 0
            while i < len(s) and j < len(t):
                if s[i] == t[j]:
                    i += 1
                j += 1
            res = i == len(s)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.isSubsequence("abc", "ahbgdc")
    return


@app.cell
def __(sol):
    assert not sol.isSubsequence("axc", "ahbgdc")
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
