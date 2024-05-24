import marimo

__generated_with = "0.6.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 3005](https://leetcode.com/problems/count-elements-with-maximum-frequency)")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(Counter, List):
    class Solution:
        def maxFrequencyElements(self, nums: List[int]) -> int:
            cnt = Counter(nums)
            ma = num = 0
            for v in cnt.values():
                if v > ma:
                    ma, num = v, 0
                num += v == ma
            res = ma * num
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maxFrequencyElements([1,2,2,3,1,4]) == 4
    return


@app.cell
def __(sol):
    assert sol.maxFrequencyElements([1,2,3,4,5]) == 5
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
