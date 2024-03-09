import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3014](https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i)")
    return


@app.cell
def __():
    from collections import Counter
    return Counter,


@app.cell
def __(Counter):
    class Solution:
        def minimumPushes(self, word: str) -> int:
            cnt, res = Counter(word), 0
            for i, c in enumerate(sorted(cnt.values(), reverse=True)):
                res += (i // 8 + 1) * c
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minimumPushes("abcde") == 5
    return


@app.cell
def __(sol):
    assert sol.minimumPushes("xycdefghij") == 12
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
