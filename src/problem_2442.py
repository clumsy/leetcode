import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2442](https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def countDistinctIntegers(self, nums: List[int]) -> int:
            s = set(n for i in nums for n in (i, int(str(i)[::-1].lstrip("0"))))
            res = len(s)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.countDistinctIntegers([1,13,10,12,31]) == 6
    return


@app.cell
def __(sol):
    assert sol.countDistinctIntegers([2,2,2]) == 1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
