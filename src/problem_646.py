import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 646](https://leetcode.com/problems/maximum-length-of-pair-chain)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def findLongestChain(self, pairs: List[List[int]]) -> int:
            pairs.sort(key=lambda i: i[1])
            res, prv = 0, -1001
            for i, (a, b) in enumerate(pairs):
                if a > prv:
                    prv = pairs[i][1]
                    res += 1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.findLongestChain([[1,2],[2,3],[3,4]]) == 2
    return


@app.cell
def __(sol):
    assert sol.findLongestChain([[1,2],[7,8],[4,5]]) == 3
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
