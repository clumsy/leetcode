import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def _(mo):
    mo.md("[Problem 1910](https://leetcode.com/problems/remove-all-occurrences-of-a-substring)")
    return


@app.cell
def _():
    class Solution:
        def removeOccurrences(self, s: str, part: str) -> str:
            n, m, i, res = len(s), len(part), 0, []
            while i < n:
                if s.startswith(part, i):
                    s = s[:i] + s[i + m:]
                    i = max(0, i - m)
                else:
                    i += 1
            res = s
            return res
    return Solution,


@app.cell
def _(Solution):
    sol = Solution()
    return sol,


@app.cell
def _(sol):
    assert sol.removeOccurrences("daabcbaabcbc", "abc") == "dab"
    return


@app.cell
def _(sol):
    assert sol.removeOccurrences("axxxxyyyyb", "xy") == "ab"
    return


@app.cell
def _():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()

