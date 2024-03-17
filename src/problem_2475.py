import marimo

__generated_with = "0.3.2"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 2475](https://leetcode.com/problems/number-of-unequal-triplets-in-array)")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(Counter, List):
    class Solution:
        def unequalTriplets(self, nums: List[int]) -> int:
            cnt, lt, rt, res = Counter(nums), 0, len(nums), 0
            for k, v in cnt.items():
                rt -= v
                res += lt * v * rt
                lt += v
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.unequalTriplets([4,4,2,4,3]) == 3
    return


@app.cell
def __(sol):
    assert sol.unequalTriplets([1,1,1,1,1]) == 0
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
