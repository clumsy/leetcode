import marimo

__generated_with = "0.7.8"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 2109](https://leetcode.com/problems/adding-spaces-to-a-string)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def addSpaces(self, s: str, spaces: List[int]) -> str:
            n, m = len(s), len(spaces)
            res = [" "] * (n + m)
            k = j = 0
            for i, c in enumerate(s):
                if j < m and i == spaces[j]:
                    k += 1
                    j += 1
                res[k] = s[i]
                k += 1
            res = "".join(res)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.addSpaces("LeetcodeHelpsMeLearn", [8,13,15]) == "Leetcode Helps Me Learn"
    return


@app.cell
def __(sol):
    assert sol.addSpaces("icodeinpython", [1,5,7,9]) == "i code in py thon"
    return


@app.cell
def __(sol):
    assert sol.addSpaces("spacing", [0,1,2,3,4,5,6]) == " s p a c i n g"
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
