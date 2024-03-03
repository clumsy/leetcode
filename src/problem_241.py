import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 241](https://leetcode.com/problems/different-ways-to-add-parentheses)")
    return


@app.cell
def __():
    from typing import List
    import operator
    return List, operator


@app.cell
def __(List, operator):
    class Solution:
        def diffWaysToCompute(self, e: str) -> List[int]:
            res = []
            for i, c in enumerate(e):
                if c not in ["+", "-", "*"]:
                    continue
                if c == "+":
                    op = operator.__add__
                if c == "-":
                    op = operator.__sub__
                if c == "*":
                    op = operator.__mul__
                lft = self.diffWaysToCompute(e[:i])
                rgt = self.diffWaysToCompute(e[i + 1:])
                for l in lft:
                    for r in rgt:
                        res.append(op(l, r))
            if not res and e:
                res.append(int(e))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.diffWaysToCompute("2-1-1") == [2, 0]
    return


@app.cell
def __(sol):
    assert sol.diffWaysToCompute("2*3-4*5") == [-34, -10, -14, -10, 10]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
