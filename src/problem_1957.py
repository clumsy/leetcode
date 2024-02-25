import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 1957](https://leetcode.com/problems/delete-characters-to-make-fancy-string)")
    return


@app.cell
def __():
    class Solution:
        def makeFancyString(self, s: str) -> str:
            res, n, size, fst = list(s), len(s), 0, 0
            for i in range(1, n):
                if s[i] != s[i - 1]:
                    fst = i
                if i - fst < 2:
                    size += 1
                res[size] = s[i]
            res = "".join(res[:size + 1])
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.makeFancyString("leeetcode") == "leetcode"
    return


@app.cell
def __(sol):
    assert sol.makeFancyString("aaabaaaa") == "aabaa"
    return


@app.cell
def __(sol):
    assert sol.makeFancyString("aab") == "aab"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
