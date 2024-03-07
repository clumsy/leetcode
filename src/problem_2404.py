import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2404](https://leetcode.com/problems/most-frequent-even-element)")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(Counter, List):
    class Solution:
        def mostFrequentEven(self, nums: List[int]) -> int:
            cnt = Counter(i for i in nums if i & 1 == 0)
            res = min((i for i, c in cnt.items() if c == max(cnt.values())), default=-1)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.mostFrequentEven([0,1,2,2,4,4,1]) == 2
    return


@app.cell
def __(sol):
    assert sol.mostFrequentEven([4,4,4,9,2,4]) == 4
    return


@app.cell
def __(sol):
    assert sol.mostFrequentEven([29,47,21,41,13,37,25,7]) == -1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
