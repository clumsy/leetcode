import marimo

__generated_with = "0.4.10"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 944](https://leetcode.com/problems/delete-columns-to-make-sorted)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def minDeletionSize(self, strs: List[str]) -> int:
            res = 0
            for c in range(len(strs[0])):
                for r in range(1, len(strs)):
                    if strs[r][c] < strs[r - 1][c]:
                        res += 1
                        break
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.minDeletionSize(["cba","daf","ghi"]) == 1
    return


@app.cell
def __(sol):
    assert sol.minDeletionSize(["a","b"]) == 0
    return


@app.cell
def __(sol):
    assert sol.minDeletionSize(["zyx","wvu","tsr"]) == 3
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
