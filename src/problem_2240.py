import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2240](https://leetcode.com/problems/number-of-ways-to-buy-pens-and-pencils)")
    return


@app.cell
def __():
    class Solution:
        def waysToBuyPensPencils(self, total: int, cost1: int, cost2: int) -> int:
            cost1, cost2 = sorted([cost1, cost2])
            # one way not to buy anything
            res = sum((total - i * cost2) // cost1 + 1 for i in range(total // cost2 + 1))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.waysToBuyPensPencils(20, 10, 5) == 9
    return


@app.cell
def __(sol):
    assert sol.waysToBuyPensPencils(5, 10, 10) == 1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
