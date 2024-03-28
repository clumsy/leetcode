import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2455](https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def averageValue(self, nums: List[int]) -> int:
            res = cnt = 0
            for i in nums:
                if i % 6 == 0:  # even only when even number of 3s, hence divisible by 6
                    res += i
                    cnt += 1
            res = res // cnt if cnt > 0 else 0
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.averageValue([1,3,6,10,12,15]) == 9
    return


@app.cell
def __(sol):
    assert sol.averageValue([1,2,4,7,10]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
