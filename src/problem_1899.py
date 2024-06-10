import marimo

__generated_with = "0.6.17"
app = marimo.App(width="medium")


@app.cell
def __(mo):
    mo.md(rf"[Problem 1899](https://leetcode.com/problems/merge-triplets-to-form-target-triplet)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def mergeTriplets(self, tpl: List[List[int]], tgt: List[int]) -> bool:
            res, cur = False, [0] * 3
            for t in tpl:
                if t[0] <= tgt[0] and t[1] <= tgt[1] and t[2] <= tgt[2]:
                    for i in range(3):
                        cur[i] = max(cur[i], t[i])
                    if cur == tgt:
                        res = True
                        break
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.mergeTriplets([[2,5,3],[1,8,4],[1,7,5]], [2,7,5])
    return


@app.cell
def __(sol):
    assert not sol.mergeTriplets([[3,4,5],[4,5,6]], [3,2,5])
    return


@app.cell
def __(sol):
    assert sol.mergeTriplets([[2,5,3],[2,3,4],[1,2,5],[5,2,3]], [5,5,5])
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
