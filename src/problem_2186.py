import marimo

__generated_with = "0.8.7"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2186](https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram-ii)""")
    return


@app.cell
def __():
    from collections import Counter
    return Counter,


@app.cell
def __(Counter):
    class Solution:
        def minSteps(self, s: str, t: str) -> int:
            sc, tc = Counter(s), Counter(t)
            res = sum(c for c in ((sc - tc) + (tc - sc)).values())
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minSteps("leetcode", "coats") == 7
    return


@app.cell
def __(sol):
    assert sol.minSteps("night", "thing") == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
