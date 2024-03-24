import marimo

__generated_with = "0.3.3"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2465](https://leetcode.com/problems/number-of-distinct-averages)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def distinctAverages(self, nums: List[int]) -> int:
            nums.sort()
            res, n = set(), len(nums)
            for i in range(n // 2):
                res.add((nums[i] + nums[n - 1 - i]) / 2)
            res = len(res)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.distinctAverages([4,1,4,0,3,5]) == 2
    return


@app.cell
def __(sol):
    assert sol.distinctAverages([1,100]) == 1
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
