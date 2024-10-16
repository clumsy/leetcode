import marimo

__generated_with = "0.9.9"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2390](https://leetcode.com/problems/removing-stars-from-a-string)""")
    return


@app.cell
def __():
    class Solution:
        def removeStars(self, s: str) -> str:
            s, j = list(s), 0
            for i in range(len(s)):
                if s[i] == "*":
                    j -= 1
                else:
                    s[j] = s[i]
                    j += 1
            res = "".join(s[:j])
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.removeStars("leet**cod*e") == "lecoe"
    return


@app.cell
def __(sol):
    assert sol.removeStars("erase*****") == ""
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
