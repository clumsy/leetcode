import marimo

__generated_with = "0.6.8"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3160](https://leetcode.com/problems/find-the-number-of-distinct-colors-among-the-balls)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def queryResults(self, lim: int, q: List[List[int]]) -> List[int]:
            cnt, clr = {}, {}
            res = [0] * len(q)
            for i, (x, y) in enumerate(q):
                was = clr.get(x)
                if was is not None:
                    cnt[was] -= 1
                    if cnt[was] == 0:
                        del cnt[was]
                clr[x] = y
                cnt[y] = cnt.get(y, 0) + 1
                res[i] = len(cnt)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.queryResults(4, [[1,4],[2,5],[1,3],[3,4]]) == [1,2,2,3]
    return


@app.cell
def __(sol):
    assert sol.queryResults(4, [[0,1],[1,2],[2,2],[3,4],[4,5]]) == [1,2,2,3,4]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
