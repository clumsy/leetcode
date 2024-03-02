import marimo

__generated_with = "0.1.81"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3046](https://leetcode.com/problems/split-the-array)")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(Counter, List):
    class Solution:
        def isPossibleToSplit(self, nums: List[int]) -> bool:
            res, cnt = True, Counter(nums)
            unq = two = 0
            for v in cnt.values():
                if v == 1:
                    unq += 1
                elif v == 2:
                    two += 1
                else:
                    res = False
            res = res and two + unq // 2 == len(nums) // 2
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.isPossibleToSplit([1,1,2,2,3,4])
    return


@app.cell
def __(sol):
    assert not sol.isPossibleToSplit([1,1,1,1])
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
