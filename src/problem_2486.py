import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2486](https://leetcode.com/problems/append-characters-to-string-to-make-subsequence)")
    return


@app.cell
def __():
    class Solution:
        def appendCharacters(self, s: str, t: str) -> int:
            res = k = 0
            n = len(t)
            for c in s:
                if t[k] == c:
                    k += 1
                    if k == n:
                        break
            res = n - k
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.appendCharacters("coaching", "coding") == 4
    return


@app.cell
def __(sol):
    assert sol.appendCharacters("abcde", "a") == 0
    return


@app.cell
def __(sol):
    assert sol.appendCharacters("z", "abcde") == 5
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
