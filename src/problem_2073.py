import marimo

__generated_with = "0.3.12"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2073](https://leetcode.com/problems/time-needed-to-buy-tickets)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def timeRequiredToBuy(self, tickets: List[int], k: int) -> int:
            res = 0
            for i, e in enumerate(tickets):
                res += min(e, tickets[k] - (i > k))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.timeRequiredToBuy([2,3,2], 2) == 6
    return


@app.cell
def __(sol):
    assert sol.timeRequiredToBuy([5,1,1,1], 0) == 8
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
