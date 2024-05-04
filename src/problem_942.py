import marimo

__generated_with = "0.4.10"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 942](https://leetcode.com/problems/di-string-match)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def diStringMatch(self, s: str) -> List[int]:
            res, i, d = [], 0, len(s)
            for c in s:
                if c == "I":
                    v = i
                    i += 1
                else:
                    v = d
                    d -= 1
                res.append(v)
            res.append(i)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.diStringMatch("IDID") == [0,4,1,3,2]
    return


@app.cell
def __(sol):
    assert sol.diStringMatch("III") == [0,1,2,3]
    return


@app.cell
def __(sol):
    assert sol.diStringMatch("DDI") == [3,2,0,1]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
