import marimo

__generated_with = "0.4.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3114](https://leetcode.com/problems/latest-time-you-can-obtain-after-replacing-characters)")
    return


@app.cell
def __():
    class Solution:
        def findLatestTime(self, s: str) -> str:
            s = list(s)
            for i, c in enumerate(s):
                if c == "?":
                    if i == 0:
                        s[i] = "1" if s[i + 1] in "01?" else "0"
                    elif i == 1:
                        s[i] = "1" if s[i - 1] != "0" else "9"
                    elif i == 3:
                        s[i] = "5"
                    else:
                        s[i] = "9"
            res = "".join(s)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.findLatestTime("1?:?4") == "11:54"
    return


@app.cell
def __(sol):
    assert sol.findLatestTime("0?:5?") == "09:59"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
