import marimo

__generated_with = "0.9.4"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2351](https://leetcode.com/problems/first-letter-to-appear-twice)""")
    return


@app.cell
def __():
    class Solution:
        def repeatedCharacter(self, s: str) -> str:
            seen = set()
            for c in s:
                if c in seen:
                    res = c
                    break
                seen.add(c)
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.repeatedCharacter("abccbaacz") == "c"
    return


@app.cell
def __(sol):
    assert sol.repeatedCharacter("abcdd") == "d"
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
