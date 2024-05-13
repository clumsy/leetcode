import marimo

__generated_with = "0.5.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 922](https://leetcode.com/problems/sort-array-by-parity-ii)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def sortArrayByParityII(self, nums: List[int]) -> List[int]:
            e, o = (i for i in nums if i & 1 == 0), (i for i in nums if i & 1 == 1)
            return [x for e, o in zip(e, o) for x in (e, o)]
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.sortArrayByParityII([4,2,5,7]) == [4,5,2,7]
    return


@app.cell
def __(sol):
    assert sol.sortArrayByParityII([2,3]) == [2,3]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
