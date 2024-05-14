import marimo

__generated_with = "0.5.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3146](https://leetcode.com/problems/permutation-difference-between-two-strings)")
    return


@app.cell
def __():
    class Solution:
        def findPermutationDifference(self, s: str, t: str) -> int:
            m = {c: i for i, c in enumerate(t)}
            res = sum(abs(i - m[c]) for i, c in enumerate(s))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.findPermutationDifference("abc", "bac") == 2
    return


@app.cell
def __(sol):
    assert sol.findPermutationDifference("abcde", "edbac") == 12
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
