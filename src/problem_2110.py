import marimo

__generated_with = "0.6.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2110](https://leetcode.com/problems/number-of-smooth-descent-periods-of-a-stock)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def getDescentPeriods(self, p: List[int]) -> int:
            res = cur = 0
            for i in range(len(p)):
                if cur == 0 or p[i - 1] - p[i] == 1:
                    cur += 1
                else:
                    res += ((1 + cur) * cur) // 2
                    cur = 1
            res += ((1 + cur) * cur) // 2
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.getDescentPeriods([3,2,1,4]) == 7
    return


@app.cell
def __(sol):
    assert sol.getDescentPeriods([8,6,7,7]) == 4
    return


@app.cell
def __(sol):
    assert sol.getDescentPeriods([1]) == 1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
