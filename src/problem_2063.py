import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2063](https://leetcode.com/problems/vowels-of-all-substrings)")
    return


@app.cell
def __():
    class Solution:
        def countVowels(self, w: str) -> int:
            n, res = len(w), 0
            for i in range(len(w)):
                if w[i] in "aeiou":
                    res += (i + 1) * (n - i)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countVowels("aba") == 6
    return


@app.cell
def __(sol):
    assert sol.countVowels("abc") == 3
    return


@app.cell
def __(sol):
    assert sol.countVowels("ltcd") == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
