import marimo

__generated_with = "0.3.8"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2496](https://leetcode.com/problems/maximum-value-of-a-string-in-an-array)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def maximumValue(self, strs: List[str]) -> int:
            return max(int(s) if s.isdigit() else len(s) for s in strs)
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maximumValue(["alic3","bob","3","4","00000"]) == 5
    return


@app.cell
def __(sol):
    assert sol.maximumValue(["1","01","001","0001"]) == 1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
