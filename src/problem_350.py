import marimo

__generated_with = "0.6.8"
app = marimo.App()


@app.cell
def __(mo):
    mo.md(r"[Problem 350](https://leetcode.com/problems/intersection-of-two-arrays-ii)")
    return


@app.cell
def __():
    from typing import List
    from collections import defaultdict
    return List, defaultdict


@app.cell
def __(List, defaultdict):
    class Solution:
        def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
            counts = defaultdict(int)
            for i in nums1:
                counts[i] += 1
            res = []
            for i in nums2:
                if counts[i] > 0:
                    counts[i] -= 1
                    res.append(i)
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.intersect([1,2,2,1], [2,2]) == [2,2]
    return


@app.cell
def __(sol):
    assert sol.intersect([4,9,5], [9,4,9,8,4]) == [9,4]
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
