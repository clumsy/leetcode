import marimo

__generated_with = "0.3.8"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3083](https://leetcode.com/problems/existence-of-a-substring-in-a-string-and-its-reverse)")
    return


@app.cell
def __():
    class Solution:
        def isSubstringPresent(self, s: str) -> bool:
            st = {s[i:i+2] for i in range(len(s) - 1)}
            r = s[::-1]
            res = any(r[i:i+2] in st for i in range(len(s) - 1))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.isSubstringPresent("leetcode")
    return


app._unparsable_cell(
    r"""
    assert sol.isSubstringPresent(\"abcba\")\"abcd\"
    """,
    name="__"
)


@app.cell
def __(sol):
    assert not sol.isSubstringPresent("abcd")
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
