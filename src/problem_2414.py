import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2414](https://leetcode.com/problems/length-of-the-longest-alphabetical-continuous-substring)")
    return


@app.cell
def __():
    class Solution:
        def longestContinuousSubstring(self, s: str) -> int:
            res = 0
            for i in range(len(s)):
                if i == 0 or ord(s[i]) - ord(s[i - 1]) != 1:
                    j = i
                res = max(res, i - j + 1)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.longestContinuousSubstring("abacaba") == 2
    return


@app.cell
def __(sol):
    assert sol.longestContinuousSubstring("abcde") == 5
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
