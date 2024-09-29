import marimo

__generated_with = "0.6.17"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 2309](https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case)")
    return


@app.cell
def __():
    from string import ascii_uppercase
    from collections import Counter
    return Counter, ascii_uppercase


@app.cell
def __(Counter, ascii_uppercase):
    class Solution:
        def greatestLetter(self, s: str) -> str:
            c = Counter(s)
            for ch in reversed(ascii_uppercase):
                if c.get(ch, 0) > 0 and c.get(ch.lower(), 0) > 0:
                    return ch
            return ""
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.greatestLetter("lEeTcOdE") == "E"
    return


@app.cell
def __(sol):
    assert sol.greatestLetter("arRAzFif") == "R"
    return


@app.cell
def __(sol):
    assert sol.greatestLetter("AbCdEfGhIjK") == ""
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
