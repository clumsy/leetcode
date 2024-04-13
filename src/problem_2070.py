import marimo

__generated_with = "0.3.12"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2070](https://leetcode.com/problems/most-beautiful-item-for-each-query)")
    return


@app.cell
def __():
    from typing import List
    from bisect import bisect_right
    return List, bisect_right


@app.cell
def __(List, bisect_right):
    class Solution:
        def maximumBeauty(self, items: List[List[int]], queries: List[int]) -> List[int]:
            items.sort()
            res, n = [], len(items)
            cur = 0
            for i in range(1, n):
                items[i][1] = max(items[i][1], items[i - 1][1])
            for q in queries:
                i = bisect_right(items, [q + 1, 0])
                i = min(n - 1, i - 1)
                res.append(items[i][1] if items[i][0] <= q else 0)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maximumBeauty([[1,2],[3,2],[2,4],[5,6],[3,5]], [1,2,3,4,5,6]) == [2,4,5,5,6,6]
    return


@app.cell
def __(sol):
    assert sol.maximumBeauty([[1,2],[1,2],[1,3],[1,4]], [1]) == [4]
    return


@app.cell
def __(sol):
    assert sol.maximumBeauty([[10,1000]], [5]) == [0]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
