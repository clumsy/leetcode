import marimo

__generated_with = "0.9.11"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"""[Problem 3324](https://leetcode.com/problems/find-the-sequence-of-strings-appeared-on-the-screen)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def stringSequence(self, t: str) -> List[str]:
            res = [t[:i] + chr(o) for i in range(len(t)) for o in range(ord("a"), ord(t[i]) + 1)]
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.stringSequence("abc") == ["a","aa","ab","aba","abb","abc"]
    return


@app.cell
def __(sol):
    assert sol.stringSequence("he") == ["a","b","c","d","e","f","g","h","ha","hb","hc","hd","he"]
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
