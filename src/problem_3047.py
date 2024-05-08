import marimo

__generated_with = "0.4.10"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3047](https://leetcode.com/problems/find-the-largest-area-of-square-inside-two-rectangles)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def largestSquareArea(self, bl: List[List[int]], tr: List[List[int]]) -> int:
            n = len(bl)
            res = j = 0
            tx_ord = sorted(range(n), key=lambda i: tr[i][0])
            for e, i2 in enumerate(tx_ord):
                tx2, ty2 = tr[i2]
                while e - 1 >= 0:
                    e -= 1
                    i1 = tx_ord[e]
                    tx1, ty1 = tr[i1]
                    bx2, by2 = bl[i2]
                    if bx2 >= tx1:
                        break
                    bx1, by1 = bl[i1]
                    dx = tx1 - max(bx2, bx1)
                    if dx > 0:
                        dy = min(ty2, ty1) - max(by2, by1)
                        if dy > 0:
                            res = max(res, min(dx, dy) ** 2)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.largestSquareArea([[1,1],[2,2],[3,1]], [[3,3],[4,4],[6,6]]) == 1
    return


@app.cell
def __(sol):
    assert sol.largestSquareArea([[1,1],[2,2],[1,2]], [[3,3],[4,4],[3,4]]) == 1
    return


@app.cell
def __(sol):
    assert sol.largestSquareArea([[1,1],[3,3],[3,1]], [[2,2],[4,4],[4,2]]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
