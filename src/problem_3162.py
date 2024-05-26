import marimo

__generated_with = "0.6.0"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3162](https://leetcode.com/problems/find-the-number-of-good-pairs-i/)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def numberOfPairs(self, nums1: List[int], nums2: List[int], k: int) -> int:
            res = sum(n1 % (n2 * k) == 0 for n1 in nums1 for n2 in nums2)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.numberOfPairs([1,3,4], [1,3,4], 1) == 5
    return


@app.cell
def __(sol):
    assert sol.numberOfPairs([1,2,4,12], [2,4], 3) == 2
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
