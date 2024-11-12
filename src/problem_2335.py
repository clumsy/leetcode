import marimo

__generated_with = "0.9.17"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2335](https://leetcode.com/problems/minimum-amount-of-time-to-fill-cups)""")
    return


@app.cell
def __():
    from typing import List
    return (List,)


@app.cell
def __(List):
    class Solution:
        def fillCups(self, amount: List[int]) -> int:
            a, b, c = sorted(amount)
            # splitting a between b and c
            res = a
            m = min(c - b, a)
            c -= m
            a -= m
            b, c = b - a // 2, c - a // 2
            m = min(b, c)
            res += m + max(b, c) - m
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.fillCups([1,4,2]) == 4
    return


@app.cell
def __(sol):
    assert sol.fillCups([5,4,4]) == 7
    return


@app.cell
def __(sol):
    assert sol.fillCups([5,0,0]) == 5
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
