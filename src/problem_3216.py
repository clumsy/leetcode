import marimo

__generated_with = "0.7.5"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(r"[Problem 3216](https://leetcode.com/problems/lexicographically-smallest-string-after-a-swap)")
    return


@app.cell
def __():
    class Solution:
        def getSmallestString(self, s: str) -> str:
            s = [int(c) for c in s]
            for i in range(len(s) - 1):
                if s[i] > s[i + 1] and (s[i] & 1) == (s[i + 1] & 1):
                    s[i], s[i + 1] = s[i + 1], s[i]
                    break
            res = "".join(str(d) for d in s)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.getSmallestString("45320") == "43520"
    return


@app.cell
def __(sol):
    assert sol.getSmallestString("001") == "001"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
