import marimo

__generated_with = "0.6.0"
app = marimo.App()


@app.cell
def __(mo):
    mo.md("[Problem 3002](https://leetcode.com/problems/maximum-size-of-a-set-after-removals)")
    return


@app.cell
def __():
    from typing import List
    return List,


@app.cell
def __(List):
    class Solution:
        def maximumSetSize(self, nums1: List[int], nums2: List[int]) -> int:
            s1, s2 = set(nums1), set(nums2)
            n1n2 = len(s1 & s2)
            n1_n2, n2_n1 = len(s1) - n1n2, len(s2) - n1n2
            n = len(nums1)
            n1, n2 = min(n // 2, n1_n2), min(n // 2, n2_n1)
            n12 = min(n - n1 - n2, n1n2)
            res = n1 + n2 + n12
            return res
    return Solution,


@app.cell
def __(Solution):
    sol = Solution()
    return sol,


@app.cell
def __(sol):
    assert sol.maximumSetSize([1,2,1,2], [1,1,1,1]) == 2
    return


@app.cell
def __(sol):
    assert sol.maximumSetSize([1,2,3,4,5,6], [2,3,2,3,2,3]) == 5
    return


@app.cell
def __(sol):
    assert sol.maximumSetSize([1,1,2,2,3,3], [4,4,5,5,6,6]) == 6
    return


@app.cell
def __():
    import marimo as mo
    return mo,


if __name__ == "__main__":
    app.run()
