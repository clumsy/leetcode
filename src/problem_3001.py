import marimo

__generated_with = "0.6.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 3001](https://leetcode.com/problems/minimum-moves-to-capture-the-queen)")
    return


@app.cell
def __():
    class Solution:
        def minMovesToCaptureTheQueen(self, rr: int, rc: int, br: int, bc: int, qr: int, qc: int) -> int:
            res = 2  # max
            if rr == qr and not (br == rr and (rc < bc < qc or qc < bc < rc)):
                res = 1
            if rc == qc and not (bc == rc and (rr < br < qr or qr < br < rr)):
                res = 1
            elif qc - qr == bc - br and not (bc - br == rc - rr and (qr < rr < br or br < rr < qr)):
                res = 1
            elif qc + qr == bc + br and not (bc + br == rc + rr and (qr < rr < br or br < rr < qr)):
                res = 1
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minMovesToCaptureTheQueen(1, 1, 8, 8, 2, 3) == 2
    return


@app.cell
def __(sol):
    assert sol.minMovesToCaptureTheQueen(5, 3, 3, 4, 5, 2) == 1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
