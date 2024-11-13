import marimo

__generated_with = "0.9.17"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"""[Problem 2341](https://leetcode.com/problems/maximum-number-of-pairs-in-array)""")
    return


@app.cell
def __():
    from typing import List
    from collections import Counter
    return Counter, List


@app.cell
def __(Counter, List):
    class Solution:
        def numberOfPairs(self, nums: List[int]) -> List[int]:
            pairs = sum(c // 2 for c in Counter(nums).values())
            res = [pairs, len(nums) - 2 * pairs]
            return res
    return (Solution,)


@app.cell
def __(Solution):
    sol = Solution()
    return (sol,)


@app.cell
def __(sol):
    assert sol.numberOfPairs([1,3,2,1,3,2,2]) == [3,1]
    return


@app.cell
def __(sol):
    assert sol.numberOfPairs([1,1]) == [1,0]
    return


@app.cell
def __(sol):
    assert sol.numberOfPairs([0]) == [0,1]
    return


@app.cell
def __():
    import marimo as mo
    return (mo,)


if __name__ == "__main__":
    app.run()
