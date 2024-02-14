import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2178](https://leetcode.com/problems/maximum-split-of-positive-even-integers)")
    return


@app.cell
def __():
    from typing import List
    from math import sqrt, floor
    return List, floor, sqrt


@app.cell
def __(List, floor, sqrt):
    class Solution:
        def maximumEvenSplit(self, fs: int) -> List[int]:
            if fs & 1 == 1:
                res = []
            else:
                x = (sqrt(1 + 4 * fs) - 1)/2
                x_ = floor(x)
                if x == x_:
                    res = [2 * i for i in range(1, x_ + 1)]
                else:
                    res = [2 * i for i in range(1, x_)]
                    res.append(fs - sum(res))
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maximumEvenSplit(12) == [2,4,6]
    return


@app.cell
def __(sol):
    assert sol.maximumEvenSplit(7) == []
    return


@app.cell
def __(sol):
    assert sol.maximumEvenSplit(28) == [2,4,6,16]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
