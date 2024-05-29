import marimo

__generated_with = "0.6.10"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(rf"[Problem 3159](https://leetcode.com/problems/find-occurrences-of-an-element-in-an-array/description)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def occurrencesOfElement(self, nums: List[int], queries: List[int], x: int) -> List[int]:
            nth = [i for i, e in enumerate(nums) if e == x]
            res = [nth[q - 1] if q - 1 < len(nth) else -1 for q in queries]
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.occurrencesOfElement([1,3,1,7], [1,3,2,4], 1) == [0,-1,2,-1]
    return


@app.cell
def __(sol):
    assert sol.occurrencesOfElement([1,2,3], [10], 5) == [-1]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
