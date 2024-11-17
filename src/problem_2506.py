import marimo

__generated_with = "0.9.20"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2506](https://leetcode.com/problems/count-pairs-of-similar-strings)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def similarPairs(self, words: List[str]) -> int:
            c, res = {}, 0
            for w in words:
                s = "".join(sorted(set(w)))
                cur = c.get(s, 0)
                res += cur
                c[s] = cur + 1
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.similarPairs(["aba","aabb","abcd","bac","aabc"]) == 2
    return


@app.cell
def __(sol):
    assert sol.similarPairs(["aabb","ab","ba"]) == 3
    return


@app.cell
def __(sol):
    assert sol.similarPairs(["nba","cba","dba"]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
