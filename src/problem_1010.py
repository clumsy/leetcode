import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 1010](https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60)")
    return


@app.cell
def __():
    from typing import List
    from collections import defaultdict
    return List, defaultdict


@app.cell
def __(List, defaultdict):
    class Solution:
        def numPairsDivisibleBy60(self, time: List[int]) -> int:
            dur, res = defaultdict(int), 0
            for t in time:
                res += dur[(60 - t) % 60]
                dur[t % 60] += 1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.numPairsDivisibleBy60([30,20,150,100,40]) == 3
    return


@app.cell
def __(sol):
    assert sol.numPairsDivisibleBy60([60,60,60]) == 3
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
