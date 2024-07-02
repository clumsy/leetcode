import marimo

__generated_with = "0.6.24"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 2000](https://leetcode.com/problems/reverse-prefix-of-word)")
    return


@app.cell
def __():
    class Solution:
        def reversePrefix(self, word: str, ch: str) -> str:
            i = word.find(ch)
            res = word if i < 0 else word[:i + 1][::-1] + word[i + 1:]
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.reversePrefix("abcdefd", "d") == "dcbaefd"
    return


@app.cell
def __(sol):
    assert sol.reversePrefix("xyxzxe", "z") == "zxyxxe"
    return


@app.cell
def __(sol):
    assert sol.reversePrefix("abcd", "z") == "abcd"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
